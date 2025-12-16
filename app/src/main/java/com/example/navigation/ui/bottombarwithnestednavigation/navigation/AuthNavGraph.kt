package com.example.navigation.ui.bottombarwithnestednavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.ui.bottombarwithnestednavigation.auth.ForgetPasswordNestedScreen
import com.example.navigation.ui.bottombarwithnestednavigation.auth.LoginNestedScreen
import com.example.navigation.ui.bottombarwithnestednavigation.auth.SignupNestedScreen

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