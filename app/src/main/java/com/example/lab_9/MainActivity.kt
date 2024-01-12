package com.example.lab_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab_9.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.circle.setOnClickListener {
            val intent = Intent(this@MainActivity, CircleActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.triangle.setOnClickListener {
            val intent = Intent(this@MainActivity, TriangleActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.square.setOnClickListener {
            val intent = Intent(this@MainActivity, SquareActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}