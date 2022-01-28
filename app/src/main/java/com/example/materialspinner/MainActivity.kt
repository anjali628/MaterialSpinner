package com.example.materialspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.materialspinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

      binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val type = arrayOf("One","Two","Three","Four","Five")

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,type.toList())

        binding.filledExposed.setAdapter(arrayAdapter)

        binding.filledExposed.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(applicationContext,binding.filledExposed.text.toString(),Toast.LENGTH_SHORT).show()
        }

    }
}