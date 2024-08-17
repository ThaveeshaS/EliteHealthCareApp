package com.example.doctorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main16)

        val BookButton = findViewById<Button>(R.id.BookButton)
        BookButton.setOnClickListener {
            val intent = Intent(this, MainActivity17::class.java)
            startActivity(intent)
        }

        var backimageView06 = findViewById<ImageView>(R.id.backimageView06)
        backimageView06.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

    }
}