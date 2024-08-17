package com.example.doctorapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main11)


        var imageView9 = findViewById<ImageView>(R.id.imageView9)
        imageView9.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }

            var imageView10 = findViewById<ImageView>(R.id.imageView10)
            imageView10.setOnClickListener {
                val intent = Intent(this, MainActivity13::class.java)
                startActivity(intent)
            }

                var imageView13 = findViewById<ImageView>(R.id.imageView13)
                imageView13.setOnClickListener {
                    val intent = Intent(this, MainActivity14::class.java)
                    startActivity(intent)
                }

                    var imageView14 = findViewById<ImageView>(R.id.imageView14)
                    imageView14.setOnClickListener {
                        val intent = Intent(this, MainActivity15::class.java)
                        startActivity(intent)
                        }

                    var backimageView01 = findViewById<ImageView>(R.id.backimageView01)
                    backimageView01.setOnClickListener {
                        val intent = Intent(this, MainActivity10::class.java)
                        startActivity(intent)
                    }

        var imageView35 = findViewById<ImageView>(R.id.imageView35)
        imageView35.setOnClickListener {
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        var imageView33 = findViewById<ImageView>(R.id.imageView33)
        imageView33.setOnClickListener {
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }
            }
        }