package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<android.widget.Button>(R.id.calculate_button)
            .setOnClickListener {
                calculateTip()
            }
    }

    private fun calculateTip() {
        val input = findViewById<android.widget.EditText>(R.id.cost_of_service)
            .text
            .ifBlank { "0" }
            .toString()
            .toFloat()
        val res: TextView = findViewById(R.id.tip_result)

        res.text = (input * 1.15).toString()
    }
}





