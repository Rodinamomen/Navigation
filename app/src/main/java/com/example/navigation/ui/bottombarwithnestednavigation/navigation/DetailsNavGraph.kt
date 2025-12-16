package com.example.navigation.ui.bottombarwithnestednavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.ui.bottombarwithnestednavigation.details.InformationNestedScreen
import com.example.navigation.ui.bottombarwithnestednavigation.details.OverviewNestedScreen

fun NavGraphBuilder.detailsNavGraph(navController: NavHostController) {
    navigation(route = "details_nested", startDestination = NestedScreen.InformationNestedScreen.route) {
        composable(route = NestedScreen.InformationNestedScreen.route) {
            InformationNestedScreen(navController = navController)
        }
        composable(route = NestedScreen.OverviewNestedScreen.route) {
            OverviewNestedScreen()
        }
    }
}