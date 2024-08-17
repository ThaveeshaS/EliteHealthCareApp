package com.example.doctorapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main19)

        var PrtextView34 = findViewById<TextView>(R.id.PrtextView34)
        PrtextView34.setOnClickListener {
            val intent = Intent(this, MainActivity20::class.java)
            startActivity(intent)
        }

        var backimageView09 = findViewById<ImageView>(R.id.backimageView09)
        backimageView09.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        var imageView29 = findViewById<ImageView>(R.id.imageView29)
        imageView29.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        var imageView44 = findViewById<ImageView>(R.id.imageView44)
        imageView44.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }
    }
}