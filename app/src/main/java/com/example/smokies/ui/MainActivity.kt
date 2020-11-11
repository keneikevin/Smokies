package com.example.smokies.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.smokies.R
import com.example.smokies.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class MainActivity : AppCompatActivity() {

    val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment?
    val navController = navHostFragment?.navController
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Smokies)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        if (navController != null) {
            binding.bottomNavigationView.setupWithNavController(navController)
        }


    binding.navHostFragment.findNavController().addOnDestinationChangedListener{ _, destination, _ ->
    when(destination.id){
        R.id.statisticsFragment,R.id.profitFragment ->binding.bottomNavigationView.visibility= View.VISIBLE
        else -> binding.bottomNavigationView.visibility= View.GONE
    }
                                                                                                                                                                                                                                                                                                                      }
    }
    }

