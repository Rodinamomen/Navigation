package com.example.navigation.ui.nestednavgraph.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.ui.nestednavgraph.DetailsNestedScreen
import com.example.navigation.ui.nestednavgraph.HomeNestedScreen

fun NavGraphBuilder.homeGraph(navController: NavHostController) {
    navigation(startDestination = NestedScreen.HomeNestedScreen.route, route = "HomeGraph") {
        composable(route = NestedScreen.HomeNestedScreen.route) {
            HomeNestedScreen(navController = navController)
        }
        composable(route = NestedScreen.DetailsNestedScreen.route) {
            DetailsNestedScreen(navController = navController)
        }
    }
}