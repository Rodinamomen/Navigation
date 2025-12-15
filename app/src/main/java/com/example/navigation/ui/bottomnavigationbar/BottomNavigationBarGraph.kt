package com.example.navigation.ui.bottomnavigationbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetUpBottomNavigationBar(navController: NavHostController) {
    NavHost(
        startDestination = BottomBarScreen.Home.route,
        navController = navController
    ) {
        composable(BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
        composable(BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
    }
}