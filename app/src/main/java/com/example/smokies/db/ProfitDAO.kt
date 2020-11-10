package com.example.smokies.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface ProfitDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProfit(profit: Profit)
    @Query("SELECT * FROM profit_table ORDER BY timestamp DESC")
    fun getAllProfitSortedByDate(): LiveData<List<Profit>>
    @Query("SELECT MAX(profit) FROM profit_table")
    fun getMaxProfit():LiveData<Float>
    @Query("SELECT SUM(profit) FROM profit_table")
    fun getTotalProfit():LiveData<Float>
    @Query("SELECT AVG(profit) FROM profit_table")
    fun getTotalAvarageProfit():LiveData<Float>
}