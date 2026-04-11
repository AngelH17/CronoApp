package com.mexiti.cronoapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mexiti.cronoapp.model.Cronos


@Database(entities = [Cronos::class], version = 2, exportSchema = false)
abstract class CronosDataBase : RoomDatabase() {
    abstract fun cronosDao(): CronosDataBaseDao
}