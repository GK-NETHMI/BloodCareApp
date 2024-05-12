package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val imageView = findViewById<ImageView>(R.id.imageView2)
        imageView.setOnClickListener {
            val intent = Intent(this, onboarding2::class.java)
            startActivity(intent)
        }

    }
}