package com.example.dailydairyapplication.views

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.dailydairyapplication.R

import com.example.dailydairyapplication.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {
    private lateinit var binding:FragmentSplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentSplashBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_loadingFragment)
        }, 2000) // Delay of 2 seconds
    }

    override fun onResume() {
        super.onResume()
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.black)//setting statusbarcolor for this screen
    }



}