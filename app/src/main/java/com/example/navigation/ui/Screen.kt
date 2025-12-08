package com.example.navigation.ui

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")

    // required Argument
    object Details : Screen(route = "details_screen/{id}/{name}") {
        fun passMultipleArgs(id: Int, name: String) = "details_screen/$id/$name"
    }

    // Optional Arguments
    object Optional : Screen(route = "optional_screen?id={id}") {
        fun passId(id: Int) = "optional_screen?id=$id"
    }
}