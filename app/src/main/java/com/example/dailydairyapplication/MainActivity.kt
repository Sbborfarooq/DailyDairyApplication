package com.example.dailydairyapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.dailydairyapplication.databinding.ActivityMainBinding
import com.example.dailydairyapplication.views.MainScreenFragment

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding?=null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        _binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onBackPressed() {
        val navController = findNavController(R.id.nav_host_fragment) // NavHostFragment ID
        val currentFragment = navController.currentDestination?.id
        // Agar current fragment MainScreenFragment hai
        if (currentFragment == R.id.mainScreenFragment) {
            val fragment =
                supportFragmentManager.findFragmentByTag(MainScreenFragment::class.java.toString())
            if (fragment is MainScreenFragment) {
                fragment.showExitDialog()
            } else {
                super.onBackPressedDispatcher.onBackPressed() // Agar fragment match nahi karta, to normal back press handle karein
            }
        } else {
            super.onBackPressedDispatcher.onBackPressed() // Agar koi aur fragment active hai, to normal back press
        }

    }
}