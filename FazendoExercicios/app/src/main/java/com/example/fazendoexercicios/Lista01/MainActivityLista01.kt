package com.example.fazendoexercicios.Lista01

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

class Activity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            Layout0101Preview()

        }
    }
}

@Composable
fun Layout0101() {

    val context = LocalContext.current

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Qual Exercicio?",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.height(20.dp))
        
        
        Button(onClick = {
            var intent = Intent(context,Ex01::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "Ex01")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            var intent = Intent(context,Ex02::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "Ex02")
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            var intent = Intent(context,Ex03::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "Ex03")
        }

    }


}



@Preview(showBackground = true)
@Composable
fun Layout0101Preview() {
    Layout0101()
}