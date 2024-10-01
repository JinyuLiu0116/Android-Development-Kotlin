package com.example.twolanguages

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.twolanguages.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bAdd.setOnClickListener{
            var firstInput = binding.firstNum.text.toString()
            var number1: Int
            if(firstInput.isEmpty()) {
                number1 = 0
            }
            else {
                number1 = Integer.parseInt(firstInput)
            }
            var secondInput = binding.secondNum.text.toString()
            var number2: Int
            if(secondInput.isEmpty()) {
                number2 = 0
            }
            else {
                number2 = Integer.parseInt(secondInput)
            }
            var result: Int = number1 + number2
            binding.textResult.text = result.toString()
        }
        binding.bSubtract.setOnClickListener{
            var firstInput = binding.firstNum.text.toString()
            var number1: Int
            if(firstInput.isEmpty()) {
                number1 = 0
            }
            else {
                number1 = Integer.parseInt(firstInput)
            }
            var secondInput = binding.secondNum.text.toString()
            var number2: Int
            if(secondInput.isEmpty()) {
                number2 = 0
            }
            else {
                number2 = Integer.parseInt(secondInput)
            }
            var result: Int = number1-number2
            binding.textResult.text = result.toString()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
