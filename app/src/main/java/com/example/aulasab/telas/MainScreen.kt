package com.example.aulasab.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.aulasab.ui.theme.AulaSabTheme

@Composable
fun MainScreen(text:String, navController:NavController) {

    var contador by remember {
        mutableStateOf(0)
    }

    Column {
        Text(text + " 1")
        Text(text = text + " 2")
        Text(text = text + " 3")
        Text(text = text + " 4")
        Row {
            Button(onClick = {

                navController.navigate("taskScreen")

                Log.i("#################", "Botão Clicado")

            }) {
                Text(text = "Task Screen")
            }
            Button(onClick = {
                contador++
                Log.i("########Contador", contador.toString())
            }) {
                Row {
                    Text(text = "Aumentar contador: ")
                    Text(text = contador.toString())
                }

            }
        }
    }


}