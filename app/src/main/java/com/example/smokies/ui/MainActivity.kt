package com.example.smokies.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.example.smokies.R
import com.example.smokies.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Smokies)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    binding.navHostFragment.findNavController().addOnDestinationChangedListener { _, destination, _ ->

        when(destination.id){
            R.id.mainFragment ->
                binding.bottomNavigationView.visibility = View.GONE
            else -> binding.bottomNavigationView.visibility = View.VISIBLE
        }



    }

    }
    }

