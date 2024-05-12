package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

public class sign_in : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        val bottom_navButton = findViewById<Button>(R.id.buttonIn)
        bottom_navButton.setOnClickListener {
            val intent = Intent (this,bottom_nav::class.java)
            startActivity(intent)
        }
        val imageView = findViewById<ImageView>(R.id.edit)
        imageView.setOnClickListener {
            val intent = Intent(this, onboarding3::class.java)
            startActivity(intent)
        }

    }
}