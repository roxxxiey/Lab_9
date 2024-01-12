package com.example.lab_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab_9.databinding.ActivitySquareBinding

class SquareActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySquareBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySquareBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.squareGoBack.setOnClickListener {
            val intent = Intent(this@SquareActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.squareCalculate.setOnClickListener {
            square_calculate()

        }

        binding.squareReset.setOnClickListener {

            binding.squareResult.text = "Result: "
            binding.length.text.clear()
        }
    }

    fun square_calculate(){
        val input = binding.length.text.toString().toInt()
        val res = input * input
        binding.squareResult.text = "Result: $res"
        //binding.invalidateAll()
    }

}