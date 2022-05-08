package com.plcoding.cleanarchitecturenoteapp.feature_note.data.storage

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.cleanarchitecturenoteapp.feature_note.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDataBase : RoomDatabase() {

    abstract val noteDao : NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}