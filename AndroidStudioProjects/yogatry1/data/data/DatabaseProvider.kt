package com.example.yogainstructorapp.data

import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context

object DatabaseProvider {
    private var INSTANCE: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context.applicationContext,
                YourDatabase::class.java,
                "your_database_name"
            ).build()
            INSTANCE = instance
            instance
        }
    }
}
