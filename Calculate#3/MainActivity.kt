package com.example.calculator

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding
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
            val firstInput = binding.firstNum.text.toString()
            val number1: Int = if(firstInput.isEmpty()) 0 else firstInput.toInt()
            val secondInput = binding.secondNum.text.toString()
            val number2: Int = if(secondInput.isEmpty()) 0 else secondInput.toInt()
            val result: Int = number1 + number2
            binding.textResult.text = result.toString()
        }
        binding.bSubtract.setOnClickListener{
            val firstInput = binding.firstNum.text.toString()
            val number1: Int = if(firstInput.isEmpty()) 0 else firstInput.toInt()
            val secondInput = binding.secondNum.text.toString()
            val number2: Int = if(secondInput.isEmpty()) 0 else secondInput.toInt()
            val result: Int = number1-number2
            binding.textResult.text = result.toString()
        }
        binding.bMultiple?.setOnClickListener{
            val firstInput = binding.firstNum.text.toString()
            val number1: Int = if(firstInput.isEmpty()) 0 else firstInput.toInt()
            val secondInput = binding.secondNum.text.toString()
            val number2: Int = if(secondInput.isEmpty()) 0 else secondInput.toInt()
            val result: Int = number1 * number2
            binding.textResult.text = result.toString()
        }
        binding.bDivide?.setOnClickListener{
            val firstInput = binding.firstNum.text.toString()
            val number1: Double = if(firstInput.isEmpty()) 0.0 else firstInput.toDouble()
            val secondInput = binding.secondNum.text.toString()
            val number2: Double = if(secondInput.isEmpty()) 0.0 else secondInput.toDouble()

            val result: Double = number1 / number2
            binding.textResult.text = result.toString()
        }
        binding.bMadular?.setOnClickListener{
            val firstInput = binding.firstNum.text.toString()
            val number1: Int = if(firstInput.isEmpty()) 0 else firstInput.toInt()
            val secondInput = binding.secondNum.text.toString()
            val number2: Int = if(secondInput.isEmpty()) 0 else secondInput.toInt()
            val result: Int = number1 % number2
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
        val userText1= binding.firstNum.text
        outState.putCharSequence("firstNumText", userText1)
        val userText2= binding.secondNum.text
        outState.putCharSequence("secondNumText", userText2)
        val userText3= binding.textResult.text.toString()
        outState.putCharSequence("resultText", userText3)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG,"onRestoreInstanceState is called")
        val userText1 = savedInstanceState.getCharSequence("firstNumText")
        binding.firstNum.setText(userText1)
        val userText2 = savedInstanceState.getCharSequence("secondNumText")
        binding.secondNum.setText(userText2)
        val userText3 = savedInstanceState.getCharSequence("resultText")
        binding.textResult.setText(userText3)
    }

}
