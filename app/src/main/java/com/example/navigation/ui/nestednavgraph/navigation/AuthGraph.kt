package com.example.navigation.ui.nestednavgraph.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigation.ui.nestednavgraph.LoginNestedScreen
import com.example.navigation.ui.nestednavgraph.SignupNestedScreen


fun NavGraphBuilder.authGraph(navController : NavHostController){
    navigation(startDestination = NestedScreen.LoginNestedScreen.route, route = "AuthGraph"){
        composable(route = NestedScreen.LoginNestedScreen.route) {
            LoginNestedScreen(navController = navController)
        }
        composable(route = NestedScreen.SignupNestedScreen.route) {
            SignupNestedScreen(navController = navController)
        }
    }
}