package com.example.ledlight.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ledlight.presentation.screens.home.HomeScreen
import com.example.ledlight.presentation.screens.home.HomeViewModel

@Composable
fun SetupNavGraph(startDestination: String, navController: NavHostController) {
    NavHost(startDestination = startDestination, navController = navController) {
        homeRoute()
    }

}

fun NavGraphBuilder.homeRoute() {
    composable(route = Screen.Home.route) {
        val viewModel = hiltViewModel<HomeViewModel>()
        val state by viewModel.state.collectAsState()
        HomeScreen(
            viewModel = viewModel,
            state = state
        )
    }
}