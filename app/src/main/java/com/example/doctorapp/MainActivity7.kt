package com.example.doctorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)

        var Nxtbutton2 = findViewById<Button>(R.id.Nxtbutton2)
        Nxtbutton2.setOnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        }

        var Prebutton2 = findViewById<Button>(R.id.Prebutton2)
        Prebutton2.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)

        }
    }
}
