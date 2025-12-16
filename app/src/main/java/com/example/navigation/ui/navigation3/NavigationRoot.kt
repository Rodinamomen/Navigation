package com.example.navigation.ui.navigation3

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.NavEntry
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay

@Composable
fun NavigationRoute(paddingValues: PaddingValues) {
    val backStack = rememberNavBackStack(Screens.NotesListScreen)
    NavDisplay(
        modifier = Modifier.padding(paddingValues),
        backStack = backStack, entryProvider = { key ->
            when (key) {
                is Screens.NotesListScreen -> {
                    NavEntry(
                        key = key
                    ) {
                        NotesListScreenUi(onNoteClicked = { it ->
                            backStack.add(Screens.NoteScreen(it))
                        })
                    }
                }

                is Screens.NoteScreen -> {
                    NavEntry(
                        key = key
                    ) {
                        NoteScreenUi(title = key.title)
                    }
                }

                else -> {
                    throw RuntimeException("no route here")
                }
            }

        })
}