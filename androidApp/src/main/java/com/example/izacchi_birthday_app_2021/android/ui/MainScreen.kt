package com.example.izacchi_birthday_app_2021.android.ui

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navHostController: NavHostController) {

    var userName by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column {
        TopAppBar(
            title = { Text("Main Screen") }
        )
        Text(text = "Hello $userName")
        OutlinedTextField(
            value = userName,
            onValueChange = { userName = it },
            label = { Text(text = "Input your name") }
        )
        Button(onClick = {
            if (userName.isNotEmpty()) {
                navHostController.navigate(route = "content")
            } else {
                Toast.makeText(context, "userName is empty", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text(text = "OK")
        }
    }
}
