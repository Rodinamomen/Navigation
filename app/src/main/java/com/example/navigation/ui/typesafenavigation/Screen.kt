package com.example.navigation.ui.typesafenavigation

import kotlinx.serialization.Serializable
@Serializable
sealed class Screen {
    @Serializable
    data object Home : Screen()
    @Serializable
    data class Profile(val id : String) : Screen()
}