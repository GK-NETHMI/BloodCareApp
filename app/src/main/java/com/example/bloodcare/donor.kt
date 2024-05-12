package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast

class donor : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private val blood= arrayOf("Rathnapura", "Galle", "Colombo", "Matara", "Moneragala", "Aampara", "Kandy", "Batticaloa")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donor)

        spinner = findViewById(R.id.spinner)

        val imageView = findViewById<ImageView>(R.id.backd)
        imageView.setOnClickListener {
            val intent = Intent(this, bottom_nav::class.java)
            startActivity(intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.imd)
        imageView2.setOnClickListener {
            val intent = Intent(this, donor_r::class.java)
            startActivity(intent)
        }


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, blood)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
        {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view:android.view.View?,
                position: Int,
                id: Long
            ) {
                val value = parent?.getItemAtPosition(position).toString()
                Toast.makeText(this@donor,value, Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}

        }


    }
}