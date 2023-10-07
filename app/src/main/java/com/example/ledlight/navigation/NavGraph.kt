package com.example.ledlight.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ledlight.presentation.screens.home.HomeScreen

@Composable
fun SetupNavGraph(startDestination: String, navController: NavHostController) {
    NavHost(startDestination = startDestination, navController = navController) {
        homeRoute()
    }

}

fun NavGraphBuilder.homeRoute() {
    composable(route = Screen.Home.route) {
        HomeScreen()
    }
}