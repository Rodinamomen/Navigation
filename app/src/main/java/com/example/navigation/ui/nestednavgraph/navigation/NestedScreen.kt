package com.example.navigation.ui.nestednavgraph.navigation

sealed class NestedScreen(val route : String){
    data object HomeNestedScreen : NestedScreen(route = "home_screen")
    data object DetailsNestedScreen : NestedScreen(route = "details_screen")
    data object LoginNestedScreen : NestedScreen(route = "login_screen")
    data object SignupNestedScreen : NestedScreen(route = "signup_screen")
}