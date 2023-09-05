package com.example.navigation_drawer_kullanimi

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.SeekBar
import android.widget.Toast
import androidx.navigation.NavController
import com.example.navigation_drawer_kullanimi.databinding.FragmentAyarlarBinding


class ayarlar : Fragment() {
    private lateinit var binding: FragmentAyarlarBinding
    private lateinit var navController: NavController



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
        binding.ayarKaydet.setOnClickListener(){
            binding.progressBar.visibility=View.VISIBLE
            val text="ayarlarınız kaydediliyor"
            val duration=Toast.LENGTH_LONG
            Toast.makeText( getActivity(),text,duration  ).show()
        }
        binding.sesAyari.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, ilerleme: Int, p2: Boolean) {
                //var gösterge=p1.toInt()
                //binding.sesGSterge.text= gösterge.toString()
                val gösterge=ilerleme.toString()
                binding.sesGSterge.text=gösterge
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                //Toast.makeText( getActivity(),"boncuk gökçe",Toast.LENGTH_LONG  ).show()

            }
        })






        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*binding.ayarKaydet.setOnClickListener(){

          navController.navigate(R.id.ayarlar_to_anasayfa)
        }*/
    }




}