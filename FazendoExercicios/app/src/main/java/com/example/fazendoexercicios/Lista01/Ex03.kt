package com.example.fazendoexercicios.Lista01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class Ex03 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Resolucao03Preview()
        }
    }
}

@Composable
fun Resolucao03() {

    Text(text = "salve")

}

@Preview(showBackground = true)
@Composable
fun Resolucao03Preview() {
    Resolucao03()
}

//tava dando erro dps de eu mudar e remudar o nome

//talvez mudar o Ex03 Novamente para ex03
