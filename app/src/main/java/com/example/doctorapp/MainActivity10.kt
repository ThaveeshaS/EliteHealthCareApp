package com.example.doctorapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("NAME_SHADOWING")
class MainActivity10 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main10)

        var imageView29 = findViewById<ImageView>(R.id.imageView29)
        imageView29.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        var imageView7 = findViewById<ImageView>(R.id.imageView7)
        imageView7.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }

        var imageView8 = findViewById<ImageView>(R.id.imageView8)
        imageView8.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
            }

        var imageView33 = findViewById<ImageView>(R.id.imageView33)
        imageView33.setOnClickListener {
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }

        var imageView6 = findViewById<ImageView>(R.id.imageView6)
        imageView6.setOnClickListener {
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }

        }
    }
