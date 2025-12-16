package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.components.BottomBar
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.navigation.BottomBarNavigation
import com.example.navigation.ui.bottomnavigationbarwithnestednavgraph.navigation.SetupRootNestedNavGraph
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTheme {
                //   SetUpNavGraph(   navController = rememberNavController())
                //   setUpNestedGraph(navController = rememberNavController())
                // MainScreen()
                navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                Scaffold(bottomBar = {
                    if (currentDestination?.hierarchy?.any() {
                            it.route in listOf(
                                BottomBarNavigation.HomeNestedScreen.route,
                                BottomBarNavigation.ProfileNestedScreen.route,
                                BottomBarNavigation.SettingsNestedScreen.route
                            )
                        } == true)
                        BottomBar(navController = navController)
                }) {
                    SetupRootNestedNavGraph(navController = navController)
                }
            }
        }
    }
}