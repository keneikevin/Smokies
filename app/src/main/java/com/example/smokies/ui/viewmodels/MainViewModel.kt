package com.example.smokies.ui.viewmodels


import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import com.example.smokies.R
import com.example.smokies.db.Profit
import com.example.smokies.repositories.MainRepository
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainViewModel@ViewModelInject constructor(val mainRepository: MainRepository
):ViewModel() {

    fun insertProfit(profit: Profit) = viewModelScope.launch { mainRepository.insertProfit(profit) }

}






































