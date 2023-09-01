package com.example.navigation_drawer_kullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation_drawer_kullanimi.databinding.FragmentHesabimBinding

class hesabim : Fragment() {
    private lateinit var binding: FragmentHesabimBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHesabimBinding.inflate(inflater,container,false)
        binding.kaydet.setOnClickListener(){
            val alinaveri=binding.girdi.text.toString()
            binding.girilenVeri.text=alinaveri

        }

        return binding.root
    }


}