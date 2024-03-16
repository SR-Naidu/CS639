package com.example.midtermsriramgopaltandra

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val editTextLiters = findViewById<EditText>(R.id.editTextLiters)
            val buttonConvert = findViewById<Button>(R.id.buttonConvert)
            val textViewResult = findViewById<TextView>(R.id.textViewResult)
            val textViewDeveloper = findViewById<TextView>(R.id.textViewDeveloper)

            buttonConvert.setOnClickListener {
                try {
                    val liters = editTextLiters.text.toString().toDouble()
                    val cups = liters * 4.22
                    textViewResult.text =
                        String.format("%.2f liters is equal to %.2f cups", liters, cups)
                } catch (e: NumberFormatException) {
                    textViewResult.text = "Please enter a valid number."
                }
            }
            buttonConvert.setOnClickListener {
                try {
                    val liters = editTextLiters.text.toString().toDouble()
                    val cups = liters * 4.22
                    textViewResult.text =
                        String.format("%.2f liters is equal to %.2f cups", liters, cups)
                } catch (e: NumberFormatException) {
                    textViewResult.text = "Please enter a valid number."
                }
            }

            // Set developer's name outside of the setOnClickListener lambda
            textViewDeveloper.text = "This app was developed by Sri Ramgopal Tandra"
            }

        }
