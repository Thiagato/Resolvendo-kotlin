package com.example.fazendoexercicios.Lista01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fazendoexercicios.CustomTextField
import com.example.fazendoexercicios.Lista01.ui.theme.FazendoExerciciosTheme

class Ex02 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Resolucao02Preview()
        }
    }
}

@Composable
fun Resolucao02() {

    var numero by remember {
        mutableStateOf("")
    }

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        //puxando o custom TextField do Main
        CustomTextField(valor = numero, valorMudar = { numero = it }, label = "Digite o numero" )

        Spacer(modifier = Modifier.height(20.dp))

        VerificadorImparOuPar(numero)
    }
}

@Composable
fun VerificadorImparOuPar(numero: String) {
    if (numero.isNotEmpty()) {
        val numeroInt = numero.toIntOrNull()
        if (numeroInt != null) {
            val verificador = numeroInt % 2
            Text(text = if (verificador == 0) "O número é par" else "O número é ímpar")
        } else {
            Text(text = "Digite um número válido")
        }
    }
}





@Preview(showBackground = true)
@Composable
fun Resolucao02Preview() {
    Resolucao02()
}