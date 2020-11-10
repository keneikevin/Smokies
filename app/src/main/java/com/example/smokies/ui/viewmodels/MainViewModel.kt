package com.example.smokies.ui.viewmodels


import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.smokies.repositories.MainRepository

class MainViewModel@ViewModelInject constructor(val mainRepository: MainRepository):ViewModel() {

}