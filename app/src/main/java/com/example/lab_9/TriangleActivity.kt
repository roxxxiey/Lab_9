package com.example.lab_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab_9.databinding.ActivityTriangleBinding

class TriangleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTriangleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTriangleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.triangleGoBack.setOnClickListener {
            val intent = Intent(this@TriangleActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.triangleCalculate.setOnClickListener {
            triangle_calculate()
        }

        binding.triangleReset.setOnClickListener {
            binding.triangleResult.text = "Result: "
            binding.triangleLengthA.text.clear()
            binding.triangleLengthB.text.clear()
        }

    }

    fun triangle_calculate(){
        val input_1 = binding.triangleLengthA.text.toString().toInt()
        val input_2 = binding.triangleLengthB.text.toString().toInt()
        binding.triangleResult.text = ("Result: ${0.5 * input_1 * input_2}")
    }

}