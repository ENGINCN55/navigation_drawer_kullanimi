package com.example.navigation_drawer_kullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import com.example.navigation_drawer_kullanimi.databinding.FragmentAnasayfaBinding


class anasayfa : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAnasayfaBinding.inflate(inflater,container,false)
       val kahveOy= binding.kahveOy
        val yumurtaOy=binding.yumurtaOy
        val çorbaOy=binding.corbaOy
        binding.corbaOy.setOnClickListener(){
            binding.oyGSterge.text=çorbaOy.toString()
        }
        binding.kahveOy.setOnClickListener(){
            binding.oyGSterge.text=kahveOy.toString()
        }
        binding.yumurtaOy.setOnClickListener(){
            binding.oyGSterge.text=yumurtaOy.toString()
        }





        return binding.root
    }


}