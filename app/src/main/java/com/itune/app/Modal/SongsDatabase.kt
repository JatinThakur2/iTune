package com.itune.app.Modal

import androidx.room.Database
import androidx.room.RoomDatabase
import com.itune.app.Modal.Song
import com.itune.app.Modal.SongsDao

@Database(entities = [Song::class], version = 1, exportSchema = false)
abstract class SongsDatabase : RoomDatabase() {
    abstract fun getDao(): SongsDao
}