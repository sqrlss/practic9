package com.bignerdranch.android.firstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin. random. Random

class MainActivity : AppCompatActivity() {
    private lateinit var buttonClick: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClick = findViewById(R.id.button_click)
        buttonClick.setOnClickListener{
            val i = Random.nextInt(2,6)
            Toast.makeText(this,i.toString(), Toast.LENGTH_SHORT).show()


        }

    }
}
