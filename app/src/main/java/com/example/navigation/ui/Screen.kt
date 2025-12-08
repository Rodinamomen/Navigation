package com.example.navigation.ui

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")

    // Single required Argument
    object Details : Screen(route = "details_screen/{id}/{name}") {
        fun passArgs(id: Int) = "details_screen/$id"
    }
}