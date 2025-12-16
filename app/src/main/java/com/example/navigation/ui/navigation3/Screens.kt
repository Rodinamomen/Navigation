package com.example.navigation.ui.navigation3

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Screens : NavKey{
    @Serializable
    data object NotesListScreen : Screens

    @Serializable
    data class NoteScreen(val title: String  ) : Screens
}