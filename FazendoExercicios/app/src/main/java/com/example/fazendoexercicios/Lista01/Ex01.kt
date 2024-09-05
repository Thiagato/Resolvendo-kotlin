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

class Ex01 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Resolucao01Preview()

        }
    }
}

@Composable
fun Resolucao01() {

    var nota1 by remember { mutableStateOf("")}
    var nota2 by remember { mutableStateOf("")}
    var nota3 by remember { mutableStateOf("")}


    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        CustomTextField(
            valor = nota1,
            valorMudar = { nota1 = it },
            label = "Digite a nota da prova 1")

        CustomTextField(
            valor = nota2,
            valorMudar = { nota2 = it },
            label = "Digite a nota da prova 2")

        CustomTextField(
            valor = nota3,
            valorMudar = { nota3 = it },
            label = "Digite a nota da prova 3")

        Spacer(modifier = Modifier.height(20.dp))

        VerificadorNota(nota1, nota2, nota3)
    }
}



@Composable
fun VerificadorNota(nota01: String, nota02: String, nota03: String) {
    // Converte as notas de String para Float, lidando com erros de conversão
    val floatNota1 = nota01.toFloatOrNull() ?: 0f
    val floatNota2 = nota02.toFloatOrNull() ?: 0f
    val floatNota3 = nota03.toFloatOrNull() ?: 0f

    val media = (floatNota1 + floatNota2 + floatNota3) / 3
    val mediaFormatada = String.format("%.2f", media)

    Text(text = "Sua média foi: $mediaFormatada")

    if (media >= 7.0) {
        Text(text = "Aprovado")
    } else {
        Text(text = "Reprovado")
    }
}



@Preview(showBackground = true)
@Composable
fun Resolucao01Preview() {
    Resolucao01()
}