package com.example.navigation.ui.navigation3

data class Note(val id: Int, val title: String)

val notes = List(100) {
    Note(id = it, title = "Note $it")
}
