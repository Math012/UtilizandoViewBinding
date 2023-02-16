package com.example.utilizandoviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.utilizandoviewbinding.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var numeroRandom = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.binding.btRandom.setOnClickListener {
            numeroRandom = (0..100).random()
            this.binding.random.setText(numeroRandom.toString())
        }








    }
}