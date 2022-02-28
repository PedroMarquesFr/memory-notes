package com.example.core.usecase

import com.example.core.data.Note
import com.example.core.repository.NoteRepository

class RemoveNote(private var noteRepository: NoteRepository) {
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}