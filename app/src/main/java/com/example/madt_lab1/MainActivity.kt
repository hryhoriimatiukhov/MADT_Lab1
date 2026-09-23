package com.example.madt_lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find UI elements by their IDs
        val myTextView = findViewById<TextView>(R.id.textView)
        val myButton = findViewById<Button>(R.id.button)

        // Handle button click event
        myButton.setOnClickListener {
            myTextView.text = "Bye World!"
        }
    }
}