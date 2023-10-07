package com.example.ledlight.navigation

sealed class Screen(val route:String){
    object Home:Screen(route = "home_screen")
}
