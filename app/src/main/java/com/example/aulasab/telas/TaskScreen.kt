package com.example.aulasab.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(
    navController:NavController
) {

    var titulo = "Título"
    var textfieldvalue by remember{ mutableStateOf("") }

    Column {
        Text(text = titulo)
        TextField(
            value = textfieldvalue,
            onValueChange = {
                textfieldvalue = it

                Log.i("############# TextField", it)
            })

        Button(onClick = { navController.navigate("main")}) {
            Text(text = "Navegar para a main")
        }
    }
    
}