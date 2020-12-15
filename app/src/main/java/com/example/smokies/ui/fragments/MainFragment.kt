package com.example.smokies.ui.fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.smokies.R
import com.example.smokies.databinding.FragmentMainBinding
import com.example.smokies.databinding.FragmentProfitBinding
import com.example.smokies.db.Profit
import com.example.smokies.ui.CalculationUtil
import com.example.smokies.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        val eggs = binding.etEggs.text.toString().toInt()
        val smokies = binding.etSmokies.text.toString().toInt()
        val bans = binding.etBans.text.toString().toInt()
        val spent = binding.etSpent.text.toString().toFloat()
        CalculationUtil.calculateInput(){

        }
        binding.floatingActionButton.setOnClickListener {
            savetoDb()
            findNavController().navigate(R.id.action_mainFragment_to_profitFragment) }

        }



    private fun savetoDb(){
        val profi = binding.profit.text.toString().toFloat()
        val mony  = binding.amount.text.toString().toFloat()
        val proffit = Profit(mony,profi)
        viewModel.insertProfit(proffit)
    }


}