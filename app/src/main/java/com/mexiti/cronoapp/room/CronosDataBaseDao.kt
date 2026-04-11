package com.mexiti.cronoapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.mexiti.cronoapp.model.Cronos
import kotlinx.coroutines.flow.Flow

@Dao
interface CronosDataBaseDao {

    @Query("SELECT * from cronos")
    fun getCronos(): Flow<List<Cronos>>

    @Query("SELECT * from cronos where id =:id")
    fun getCronosById(id:Long): Flow<Cronos>

    @Insert
    suspend fun insert(cronos: Cronos)

    @Update
    suspend fun update(cronos: Cronos)

    @Delete
    suspend fun delete(cronos: Cronos)
}