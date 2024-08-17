package com.example.doctorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main20)

        var UpdateButton = findViewById<Button>(R.id.UpdateButton)
        UpdateButton.setOnClickListener {
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }

        var backimageView10 = findViewById<ImageView>(R.id.backimageView10)
        backimageView10.setOnClickListener {
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }
    }
}
