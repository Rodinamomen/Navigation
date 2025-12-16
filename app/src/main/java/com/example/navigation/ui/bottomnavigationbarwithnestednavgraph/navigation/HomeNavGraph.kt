package com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.home.HomeNestedScreen
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.home.ProfileNestedScreen
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.home.SettingsNestedScreen

fun NavGraphBuilder.homeNavGraph(navController: NavHostController) {
    navigation(route = "home_nested", startDestination = BottomBarNavigation.HomeNestedScreen.route) {
        composable(route = BottomBarNavigation.HomeNestedScreen.route) {
            HomeNestedScreen(navController)
        }
        composable(route = BottomBarNavigation.ProfileNestedScreen.route) {
            ProfileNestedScreen()
        }
        composable(route = BottomBarNavigation.SettingsNestedScreen.route) {
            SettingsNestedScreen()
        }
    }
}