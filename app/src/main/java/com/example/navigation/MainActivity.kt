package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.nestednavgraph.navigation.setUpNestedGraph
import com.example.navigation.ui.singlegraph.SetUpNavGraph
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTheme {
                //   SetUpNavGraph(   navController = rememberNavController())
                setUpNestedGraph(navController = rememberNavController())
            }
        }
    }
}