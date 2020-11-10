package com.example.smokies.repositories

import com.example.smokies.db.Profit
import com.example.smokies.db.ProfitDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val profitDAO: ProfitDAO
) {
    suspend fun insertProfit(profit: Profit) = profitDAO.insertProfit(profit)
    fun getAllProfitSortedByDate() = profitDAO.getAllProfitSortedByDate()
    fun getMaxProfit() = profitDAO.getMaxProfit()
    fun getTotalProfit() =profitDAO.getTotalProfit()
    fun getTotalAvarageProfit() = profitDAO.getTotalAvarageProfit()
}