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
import com.example.dailydairyapplication.databinding.FragmentLoadingBinding


class LoadingFragment : Fragment() {
    // ViewBinding variable
    private var _binding: FragmentLoadingBinding? = null
    private val binding get() = _binding!!

    private val handler = Handler(Looper.getMainLooper())  // Handler for the loading simulation

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout using binding
        _binding = FragmentLoadingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Start the loading progress simulation
        startLoadingProgress()
        binding.startButton.setOnClickListener {
            findNavController().navigate(R.id.action_loadingFragment_to_mainScreenFragment)
        }


    }

    private fun startLoadingProgress() {
        var progress = 0
        val maxProgress = 100
        val delay: Long = 50 // Delay in milliseconds for smooth progress

        // Set initial progress to 0
        binding.progressBar.progress = progress
        binding.progressBar.max = maxProgress

        // Simulate loading using a runnable
        val runnable = object : Runnable {
            override fun run() {
                progress += 2 // Increment progress value
                binding.progressBar.progress = progress

                if (progress < maxProgress) {
                    handler.postDelayed(this, delay) // Continue updating
                } else {
                    // Progress complete, show the button
                    binding.startButton.visibility = View.VISIBLE
                    binding.adsText.visibility = View.VISIBLE
                }
            }
        }
        handler.post(runnable) // Start the runnable
    }

    override fun onResume() {
        super.onResume()
        requireActivity().window.statusBarColor = ContextCompat.getColor(requireContext(), R.color.loading_color)//setting statusbarcolor for this screen
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Avoid memory leaks
    }
}