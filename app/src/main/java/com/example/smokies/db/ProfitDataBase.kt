package com.example.smokies.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Profit::class],
    version = 1
)
abstract class ProfitDataBase:RoomDatabase() {
    abstract fun getProfitDao(): ProfitDAO
}