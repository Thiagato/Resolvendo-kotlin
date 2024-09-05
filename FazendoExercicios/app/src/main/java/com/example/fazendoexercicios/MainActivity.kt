package com.example.fazendoexercicios

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fazendoexercicios.Lista01.Activity2
import com.example.fazendoexercicios.Lista02.Activity3

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           LayoutView()
                }
            }
        }


@Composable
fun Layout1(modifier: Modifier = Modifier) {
    val context = LocalContext.current

    //Padronizar deixar tudo no meio
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Qual atividade deseja executar?",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.height(20.dp))

        //redirecionamento
        Button(onClick = {

            var intent = Intent(context, Activity2::class.java)
            context.startActivity(intent)

        }) {
            Text(text = "Lista 01 ")
        }

        Spacer(modifier = Modifier.height(20.dp))
        //redirecionamento 2
        Button(onClick = {

            var intent = Intent(context, Activity3::class.java)
            context.startActivity(intent)

        }) {
            Text(text = "Lista 02")
        }

    }

}

@Composable
fun CustomTextField(valor: String,  valorMudar: (String) -> Unit, label: String
) {
    TextField(
        value = valor,
        onValueChange = { novoValor -> valorMudar(novoValor) },
        label = { Text(text = label) }
    )
}

@Preview(showBackground = true)
@Composable
fun LayoutView(){
    Layout1()
    
}