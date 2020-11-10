package com.example.smokies.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "profit_table")
data class Profit(
    var money:Float =0F,
    var profit:Float=0F,

    var timestamp:Long = 0L,
) {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null

}