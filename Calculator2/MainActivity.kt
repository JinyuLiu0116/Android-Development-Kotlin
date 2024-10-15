package com.example.twolanguages

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.twolanguages.databinding.ActivityMainBinding
import org.w3c.dom.Text
import kotlin.math.log
private const val TAG = "MainActivity: "
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

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"On start is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"On resume is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"On pause is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"On stop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"On destroy is called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG,"onSaveInstanceState is called")
        val usertText= binding.firstNum.text
        outState.putCharSequence("savedText", usertText)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG,"onRestoreInstanceState is called")


    }

}
