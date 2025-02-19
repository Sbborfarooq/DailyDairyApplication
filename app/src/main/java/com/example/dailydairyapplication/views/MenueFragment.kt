package com.example.dailydairyapplication.views

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dailydairyapplication.R
import com.example.dailydairyapplication.databinding.FragmentMenueBinding


class MenueFragment : Fragment() {
    private var _binding:FragmentMenueBinding?=null
    private val binding get()=_binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentMenueBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
            //handling backarrow button
        binding.backArrow.setOnClickListener(){
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }


}