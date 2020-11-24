package com.example.smokies.ui.fragments


import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import androidx.navigation.fragment.findNavController
import com.example.smokies.R
import com.example.smokies.databinding.FragmentMainBinding
import com.example.smokies.databinding.FragmentProfitBinding
import com.example.smokies.db.Profit
import com.example.smokies.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        binding.floatingActionButton.setOnClickListener {
            savetoDb()
            findNavController().navigate(R.id.action_mainFragment_to_profitFragment) }

        subscribeToObservers()

        setSmokies(binding.etSmokies.toString().toInt())
        setEggs(binding.etEggs.toString().toInt())
        setBans(binding.etBans.toString().toInt())
        setSpent(binding.etSmokies.toString().toInt())
        }


    fun setSpent(x:Int) {
    viewModel.spent.value = x
    }

    fun setSmokies(x:Int){
        viewModel.smokies.value = x
    }
    fun setBans(x:Int){
        viewModel.bans.value = x
    }
    fun setEggs(x:Int) {
        viewModel.eggs.value = x
    }

    private fun subscribeToObservers(){


    }

    private fun savetoDb(){
        val profi = binding.textView.text.toString().toFloat()
        val mony  = binding.textView.text.toString().toFloat()
        val proffit = Profit(mony,profi)
        viewModel.insertProfit(proffit)
    }


}