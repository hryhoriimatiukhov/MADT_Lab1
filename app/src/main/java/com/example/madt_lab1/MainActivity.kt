package com.example.madt_lab1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<ConstraintLayout>(R.id.main)
        val myTextView = findViewById<TextView>(R.id.textView)
        val myButton = findViewById<Button>(R.id.button)
        val btnColor = findViewById<Button>(R.id.button2)
        val btnBgColor = findViewById<Button>(R.id.button3)

        // The first button changes the text
        myButton.setOnClickListener {
            myTextView.text = "Bye world!"
        }

        // The second button changes the text color
        btnColor.setOnClickListener {
            myTextView.setTextColor(Color.RED)
        }

        // The third button changes the background color of the screen
        btnBgColor.setOnClickListener {
            mainLayout.setBackgroundColor(Color.YELLOW)
        }
    }
}