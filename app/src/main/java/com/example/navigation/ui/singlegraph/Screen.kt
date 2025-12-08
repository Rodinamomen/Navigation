package com.example.navigation.ui.singlegraph

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen")

    // required Argument
    object Details : Screen(route = "details_screen/{id}/{name}") {
        fun passMultipleArgs(id: Int, name: String) = "details_screen/$id/$name"
    }

    // Optional Arguments
    object Optional : Screen(route = "optional_screen?id={id}&name={name}") {
        fun passId(id: Int) = "optional_screen?id=$id"
        fun passIdAndName(id: Int=0, name: String="") = "optional_screen?id=$id&name=$name"
    }
}