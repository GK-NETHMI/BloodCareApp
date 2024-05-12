package com.example.bloodcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class register : AppCompatActivity() {
  private lateinit var spinner: Spinner
  private val blood= arrayOf("A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        spinner = findViewById(R.id.spinner)

        val register_msgButton = findViewById<Button>(R.id.buttonIn)
        register_msgButton.setOnClickListener {
            val intent = Intent (this,register_msg::class.java)
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
                Toast.makeText(this@register,value,Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}

           }
    }
}