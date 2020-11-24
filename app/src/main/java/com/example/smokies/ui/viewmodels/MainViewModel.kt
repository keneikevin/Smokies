package com.example.smokies.ui.viewmodels


import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.example.smokies.R
import com.example.smokies.db.Profit
import com.example.smokies.repositories.MainRepository
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.launch

class MainViewModel@ViewModelInject constructor(val mainRepository: MainRepository
):ViewModel() {
     val smokies by lazy {
       MutableLiveData<Int>()  }

    val eggs by lazy {
        MutableLiveData<Int>()  }
    val bans by lazy {
        MutableLiveData<Int>()  }
    val spent by lazy {
        MutableLiveData<Int>()  }


    val profitt= addProfit()
        fun addProfit(): Int {
            val proff:Int= smokies.value.toString().toInt()+eggs.value.toString().toInt()+bans.value.toString().toInt()-spent.value.toString().toInt()
            return proff
        }
    fun insertProfit(profit: Profit) = viewModelScope.launch { mainRepository.insertProfit(profit) }
}






































