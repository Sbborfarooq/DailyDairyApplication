package com.example.dailydairyapplication.views


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.dailydairyapplication.classes.WriteViewModel
import com.example.dailydairyapplication.databinding.FragmentWriteBinding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


//val currentTime = SimpleDateFormat("hh:mm a", Locale.getDefault()).format(Date())


class
WriteFragment : Fragment() {

    private var _binding: FragmentWriteBinding? = null
    private val binding get() = _binding!!

    private lateinit var writeViewModel: WriteViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        writeViewModel = ViewModelProvider(this).get(WriteViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using View Binding
        _binding = FragmentWriteBinding.inflate(inflater, container, false)
        binding.viewModel = writeViewModel
        binding.lifecycleOwner = viewLifecycleOwner

        // Get the current time and display it in the TextView
        val currentTime = SimpleDateFormat("hh:mm a", Locale.getDefault()).format(Date())
        binding.textView3.text = "${binding.textView3.text} $currentTime"

        val currentMonthDate = SimpleDateFormat("MMMM dd", Locale.getDefault()).format(Date())
        binding.dateTextView.text = currentMonthDate

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Avoid memory leaks
    }


}