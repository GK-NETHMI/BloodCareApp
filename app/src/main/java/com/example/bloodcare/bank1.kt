package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class bank1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bank1)

        val imageView = findViewById<ImageView>(R.id.imageView20)
        imageView.setOnClickListener {
            val intent = Intent(this, bank::class.java)
            startActivity(intent)
        }

    }
}