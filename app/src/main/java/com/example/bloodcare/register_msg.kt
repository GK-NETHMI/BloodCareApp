package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class register_msg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_msg)

        val bottom_navButton = findViewById<Button>(R.id.button)
        bottom_navButton.setOnClickListener {
            val intent = Intent (this,bottom_nav::class.java)
            startActivity(intent)
        }


        val sign_inButton = findViewById<Button>(R.id.button2)
        sign_inButton.setOnClickListener {
            val intent = Intent (this,sign_in::class.java)
            startActivity(intent)
        }

        val imageView = findViewById<ImageView>(R.id.edit)
        imageView.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }

    }
}