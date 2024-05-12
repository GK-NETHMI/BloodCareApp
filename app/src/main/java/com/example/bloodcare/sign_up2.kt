package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class sign_up2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up2)

        val bottom_navButton = findViewById<Button>(R.id.buttonUp2)
        bottom_navButton.setOnClickListener {
            val intent = Intent (this,bottom_nav::class.java)
            startActivity(intent)
        }

        val imageView = findViewById<ImageView>(R.id.edit)
        imageView.setOnClickListener {
            val intent = Intent(this, sing_up::class.java)
            startActivity(intent)
        }

    }
}