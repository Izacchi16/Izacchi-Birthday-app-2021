package com.example.izacchi_birthday_app_2021.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.izacchi_birthday_app_2021.android.ui.ContentScreen
import com.example.izacchi_birthday_app_2021.android.ui.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavigationHost(navHostController = navController)
        }
    }
}

@Composable
fun NavigationHost(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = "main") {
        composable("main") {
            MainScreen(navHostController)
        }
        composable("content") {
            ContentScreen(navHostController)
        }
    }
}