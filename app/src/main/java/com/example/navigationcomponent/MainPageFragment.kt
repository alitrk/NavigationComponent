package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentMainPageBinding

class MainPageFragment : Fragment() {

    private lateinit var binding: FragmentMainPageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainPageBinding.inflate(inflater, container, false)

        binding.buttonMainPageToA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainPageFragment_to_pageAFragment)
        }
        binding.buttonMainPageToX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainPageFragment_to_pageXFragment)
        }

        return binding.root
    }
}