package com.example.memorynotes.framework.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.core.data.Note

@Entity(tableName = "note")
data class NoteEntity (
    val title: String,
    val content: String,

    @ColumnInfo(name = "creation_time")
    val createTime: Long,

    @ColumnInfo(name = "update_time")
    var updateTime: Long,

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L
) {
    companion object {
        fun fromNote(note: Note) = NoteEntity(note.title, note.content, note.creatienTime, note.updateTime)
    }
    fun toNote() = Note(title, content, createTime, updateTime, id)
}