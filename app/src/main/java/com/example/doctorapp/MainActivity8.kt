package com.example.doctorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main8)

        var Nxtbutton3 = findViewById<Button>(R.id.Nxtbutton3)
        Nxtbutton3.setOnClickListener {
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)
        }

        var Prebutton3 = findViewById<Button>(R.id.Prebutton3)
        Prebutton3.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
    }
}
}