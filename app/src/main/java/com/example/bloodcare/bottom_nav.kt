package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.google.android.material.bottomnavigation.BottomNavigationView

class bottom_nav : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)


        val imageView = findViewById<ImageView>(R.id.imageView6)
        imageView.setOnClickListener {
            val intent = Intent(this, bank::class.java)
            startActivity(intent)
        }

        val imageView1 = findViewById<ImageView>(R.id.donor)
        imageView1.setOnClickListener {
            val intent = Intent(this, donor::class.java)
            startActivity(intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.profile)
        imageView2.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bottomNavigationView.selectedItemId = R.id.bottom_home

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.bottom_home -> true
                R.id.bottom_notification -> {
                    startActivity(Intent(applicationContext, notification::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }

                R.id.bottom_settings -> {
                    startActivity(Intent(applicationContext, settings::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }

                R.id.bottom_profile -> {
                    startActivity(Intent(applicationContext, profile::class.java))
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                    finish()
                    true
                }

                else -> false
            }
        }
    }
}





