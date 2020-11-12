package com.example.smokies.ui.fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.smokies.R
import com.example.smokies.databinding.FragmentProfitBinding
import com.example.smokies.ui.viewmodels.MainViewModel
import com.example.smokies.ui.viewmodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfitFragment : Fragment(R.layout.fragment_profit) {
    private lateinit var binding: FragmentProfitBinding
    private val viewModel: MainViewModel by viewModels()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfitBinding.bind(view)
        binding.fab.setOnClickListener { findNavController().navigate(R.id.action_profitFragment_to_mainFragment) }
    }

}