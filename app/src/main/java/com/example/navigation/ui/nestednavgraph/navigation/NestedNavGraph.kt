package com.example.navigation.ui.nestednavgraph.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost


@Composable
fun setUpNestedGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "HomeGraph",
        route = "MainGraph"
    ) {
        homeGraph(navController = navController)
        authGraph(navController = navController)
    }
}