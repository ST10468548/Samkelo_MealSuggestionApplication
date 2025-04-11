package com.example.programmaticlayoutapp
import androidx.activity.ComponentActivity

import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Root LinearLayout
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }

        // TextView
        val textView = TextView(this).apply {
            text = "Hello, Hera!"
            textSize = 24f
            gravity = Gravity.CENTER
        }

        // Button
        val button = Button(this).apply {
            text = "Click Me!"
        }

        // Optional: Click listener
        button.setOnClickListener {
            textView.text = "You clicked the button 🎉"
        }
    }
}

// Add views to layout
