package com.single.weatherforecast.data.cache

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [CityDbModel::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favouriteCityDao():FavouriteCityDao
    companion object {
        private var db: AppDatabase? = null
        private const val DM_NAME = "main.db"
        private val LOCK = Any()
        fun getInstance(context: Context): AppDatabase {
            db?.let { return it }

            synchronized(LOCK) {
                db?.let { return it }

                val instance =
                    Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        DM_NAME
                    ).build()
                db = instance

                return instance
            }
        }
    }
}
