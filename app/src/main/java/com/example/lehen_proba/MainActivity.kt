package com.example.lehen_proba

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.lehen_proba.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //val testua1 = findViewById<TextView>(R.id.label)
        //testua1.setText("Ongi etorri")

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayLista = arrayOf("")
        


    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"actividad creada", Toast.LENGTH_SHORT).show()
        //TODO prueba todo
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }
}