package com.example.dailydairyapplication.views

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.activity.addCallback
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.dailydairyapplication.R
import com.example.dailydairyapplication.databinding.FragmentLoadingBinding
import com.example.dailydairyapplication.databinding.FragmentMainScreenBinding


class MainScreenFragment : Fragment() {
    private var _binding: FragmentMainScreenBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using binding
        _binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        return binding.root      
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Yahan par back press ke liye dialog setup karen
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner) {
            if (isAdded) {  // Ensures fragment is still added to the activity
                showExitDialog() // Show exit dialog on back press
            }
        }

        //navigation
        binding.menueButton.setOnClickListener{
            findNavController().navigate(R.id.action_mainScreenFragment_to_menueFragment)
        }
        binding.writeButton.setOnClickListener{
            findNavController().navigate(R.id.action_mainScreenFragment_to_writeFragment)
        }
        binding.savedNotesButton.setOnClickListener{
            findNavController().navigate(R.id.action_mainScreenFragment_to_savedNotesFragment)
        }
        binding.foldersButton.setOnClickListener{
            findNavController().navigate(R.id.action_mainScreenFragment_to_foldersFragment)
        }
        binding.draftButtons.setOnClickListener{
            findNavController().navigate(R.id.action_mainScreenFragment_to_draftsFragment)
        }
    }


    fun showExitDialog() {
        // Create custom view for dialog
        val dialogView = layoutInflater.inflate(R.layout.dialog_custom, null)

        // Create the dialog builder and set the custom view
        val builder = AlertDialog.Builder(requireContext())
            .setView(dialogView)
            .setCancelable(false)

        // Create the dialog instance
        val alertDialog = builder.create()

        // Set the width of the dialog to full screen
        val width = ViewGroup.LayoutParams.MATCH_PARENT
        val height = ViewGroup.LayoutParams.WRAP_CONTENT
        alertDialog.window?.setLayout(width, height)

        // Handle buttons

        val yesButton = dialogView.findViewById<Button>(R.id.button_yes)
        val noButton = dialogView.findViewById<Button>(R.id.button_no)

        yesButton.setOnClickListener {
            alertDialog.dismiss() // Dismiss the dialog
            requireActivity().finish() // Close the app
        }

        noButton.setOnClickListener {
            alertDialog.dismiss() // Dismiss the dialog
        }

        // Show the dialog
        alertDialog.show()
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