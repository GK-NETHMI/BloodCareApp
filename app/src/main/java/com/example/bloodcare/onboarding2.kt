package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val onboarding3Button = findViewById<Button>(R.id.button3)
        onboarding3Button.setOnClickListener {
            val intent = Intent (this,onboarding3::class.java)
            startActivity(intent)
        }

        val imageView = findViewById<ImageView>(R.id.edit)
        imageView.setOnClickListener {
            val intent = Intent(this, onboarding1::class.java)
            startActivity(intent)
        }

    }
}