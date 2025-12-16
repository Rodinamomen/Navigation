package com.example.navigation.ui.bottombarwithnestednavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetupRootNestedNavGraph(navController: NavHostController){
    NavHost(navController = navController, route ="root_graph", startDestination = "auth_nested"){
        authNavGraph(navController= navController)
        homeNavGraph(navController= navController)
        detailsNavGraph(navController= navController)
    }
}