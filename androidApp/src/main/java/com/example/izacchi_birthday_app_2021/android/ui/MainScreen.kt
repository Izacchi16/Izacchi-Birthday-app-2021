package com.example.izacchi_birthday_app_2021.android.ui

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.izacchi_birthday_app_2021.BirthdayChecker

@Composable
fun MainScreen(navHostController: NavHostController) {

    var birthday by remember { mutableStateOf("") }
    val context = LocalContext.current

    TopAppBar(
        title = { Text("Izacchi Birthday app 2021") }
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = birthday,
            onValueChange = { birthday = it },
            label = { Text(text = "Your Birthday") }
        )
        Button(
            modifier = Modifier.padding(top = 8.dp),
            onClick = {
                if (birthday.isNotEmpty()) {
                    if (BirthdayChecker().isIzacchiBirthday(birthday)) {
                        Toast.makeText(context, "Happy Birthday", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(context, "Today is not Birthday", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(context, "Birthday is empty", Toast.LENGTH_SHORT).show()
                }
            }
        ) {
            Text(text = "OK")
        }
    }
}
