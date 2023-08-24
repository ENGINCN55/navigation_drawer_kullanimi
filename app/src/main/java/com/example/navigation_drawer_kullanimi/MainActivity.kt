package com.example.navigation_drawer_kullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigation_drawer_kullanimi.databinding.ActivityMainBinding
import com.example.navigation_drawer_kullanimi.databinding.FragmentAnasayfaBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}