package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val sing_upButton = findViewById<Button>(R.id.buttonUp)
        sing_upButton.setOnClickListener {
            val intent = Intent (this,sing_up::class.java)
            startActivity(intent)
        }

        val sign_inButton = findViewById<Button>(R.id.buttonIn)
        sign_inButton.setOnClickListener {
            val intent = Intent (this,sign_in::class.java)
            startActivity(intent)
        }

        val registerButton = findViewById<Button>(R.id.reg)
        registerButton.setOnClickListener {
            val intent = Intent (this,register::class.java)
            startActivity(intent)
        }

        val imageView = findViewById<ImageView>(R.id.edit)
        imageView.setOnClickListener {
            val intent = Intent(this, onboarding2::class.java)
            startActivity(intent)
        }

    }
}