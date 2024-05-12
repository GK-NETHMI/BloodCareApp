package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class sing_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_up)

        val sign_up2Button = findViewById<Button>(R.id.buttonUp1)
        sign_up2Button.setOnClickListener {
            val intent = Intent (this,sign_up2::class.java)
            startActivity(intent)
        }

        val imageView = findViewById<ImageView>(R.id.edit)
        imageView.setOnClickListener {
            val intent = Intent(this, onboarding3::class.java)
            startActivity(intent)
        }

    }
}