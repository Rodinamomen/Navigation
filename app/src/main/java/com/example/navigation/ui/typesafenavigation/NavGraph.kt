package com.example.navigation.ui.typesafenavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = Screen.Home){
        composable< Screen.Home>{
            HomeScreen(navController)
        }
        composable< Screen.Profile>{ backStackEntry ->
            ProfileScreen(navController, id = backStackEntry.toRoute<Screen.Profile>().id)
        }
    }
}