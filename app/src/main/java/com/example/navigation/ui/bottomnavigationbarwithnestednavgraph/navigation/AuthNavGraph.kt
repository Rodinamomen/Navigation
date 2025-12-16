package com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.auth.ForgetPasswordNestedScreen
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.auth.LoginNestedScreen
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.auth.SignupNestedScreen

fun NavGraphBuilder.authNavGraph(navController: NavHostController) {
    navigation(route = "auth_nested", startDestination = NestedScreen.LoginNestedScreen.route) {
        composable(route = NestedScreen.LoginNestedScreen.route) {
            LoginNestedScreen(navController = navController)
        }
        composable(route = NestedScreen.SignupNestedScreen.route) {
            SignupNestedScreen(navController = navController)
        }
        composable(route = NestedScreen.ForgetNestedScreen.route) {
            ForgetPasswordNestedScreen()
        }

    }
}