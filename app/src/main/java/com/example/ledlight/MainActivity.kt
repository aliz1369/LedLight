package com.example.ledlight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.ledlight.navigation.Screen
import com.example.ledlight.navigation.SetupNavGraph
import com.example.ledlight.ui.theme.LedLightTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LedLightTheme {
                val navController = rememberNavController()
                SetupNavGraph(startDestination = Screen.Home.route, navController = navController)
            }
        }
    }
}
