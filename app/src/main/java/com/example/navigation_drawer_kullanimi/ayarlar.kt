package com.example.navigation_drawer_kullanimi

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import com.example.navigation_drawer_kullanimi.databinding.FragmentAyarlarBinding


class ayarlar : Fragment() {
    private lateinit var binding: FragmentAyarlarBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentAyarlarBinding.inflate(inflater,container,false)
        binding.switch2.setOnCheckedChangeListener {compoundButton, b ->

        if(b){
            Log.e("Switch","ON")
        }else{
            Log.e("Switch","OFF")
        }

    }





        return binding.root
    }


}