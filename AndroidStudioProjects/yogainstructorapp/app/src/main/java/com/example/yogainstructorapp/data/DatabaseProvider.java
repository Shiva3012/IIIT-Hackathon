package com.example.yogainstructorapp.data;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}

public class DatabaseProvider {
    private static AppDatabase database;

    public static AppDatabase getDatabase(final Context context) {
        if (database == null) {
            synchronized (AppDatabase.class) {
                if (database == null) {
                    database = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "yoga_database").build();
                }
            }
        }
        return database;
    }
}
