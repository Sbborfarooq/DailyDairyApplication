package com.example.dailydairyapplication.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dailydairyapplication.R
import com.example.dailydairyapplication.databinding.FragmentSavedNotesBinding


class SavedNotesFragment : Fragment() {

    private var _binding: FragmentSavedNotesBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSavedNotesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backArrow.setOnClickListener {
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }


}