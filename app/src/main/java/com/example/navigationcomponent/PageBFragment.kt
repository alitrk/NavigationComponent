package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentPageBBinding

class PageBFragment : Fragment() {

    private lateinit var binding: FragmentPageBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding =  FragmentPageBBinding.inflate(inflater, container, false)

        binding.buttonPageBToY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_pageBFragment_to_pageYFragment)
        }
        return binding.root
    }

}