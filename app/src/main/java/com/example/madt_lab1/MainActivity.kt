package com.example.madt_lab1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTextView = findViewById<TextView>(R.id.textView)
        val myButton = findViewById<Button>(R.id.button)
        val btnColor = findViewById<Button>(R.id.button2)

        // The first button changes the text
        myButton.setOnClickListener {
            myTextView.text = "Bye World!"
        }

        // The second button changes the text colour to red
        btnColor.setOnClickListener {
            myTextView.setTextColor(Color.RED)
        }
    }
}