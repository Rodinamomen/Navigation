package com.example.navigation.ui.navigation3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun NotesListScreenUi(onNoteClicked: (String) -> Unit) {
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(notes) { note ->
            Column(modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onNoteClicked(note.title)
                }) {
                Text(
                    text = note.title
                )
            }
        }
    }
}