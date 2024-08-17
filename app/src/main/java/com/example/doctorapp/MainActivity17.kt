package com.example.doctorapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity17 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main17)

        var PayButton = findViewById<Button>(R.id.PayButton)
        PayButton.setOnClickListener {
            val intent = Intent(this, MainActivity18::class.java)
            startActivity(intent)

        }

        var backimageView07 = findViewById<ImageView>(R.id.backimageView07)
        backimageView07.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

    }
}