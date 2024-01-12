package com.example.lab_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.lab_9.databinding.ActivityCircleBinding

class CircleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCircleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityCircleBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.circleGoBack.setOnClickListener {
            val intent = Intent(this@CircleActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.circleCalculate.setOnClickListener {
            circle_calculate()

        }

        binding.circleReset.setOnClickListener {

            binding.circleResult.text = "Result: "
            binding.radius.text.clear()
        }

    }



    fun circle_calculate(){
        val input = binding.radius.text.toString().toInt()
        val res = input * input
        binding.circleResult.text = "Result: $res"

        binding.invalidateAll()
    }

}