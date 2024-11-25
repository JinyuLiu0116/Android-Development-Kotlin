package com.example.finalproject

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.finalproject.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val quizData = mapOf(
        "What is the capital of France?" to listOf("Paris", "London", "Berlin", "Madrid"),
        "What is 2 + 2?" to listOf("3", "4", "5", "6"),
        "Which is the largest ocean?" to listOf("Pacific", "Atlantic", "Indian", "Arctic")
    )
    private val questions = quizData.keys.toList()
    private val answers = mutableMapOf<Int, Int>()
    private var questionIndex = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        updateQuestion()

        binding.btPrev.setOnClickListener {
            if (questionIndex > 0) {
                saveAnswer()
                questionIndex--
                updateQuestion()
            }
        }
        binding.btNext.setOnClickListener {
            if (questionIndex < questions.size - 1) {
                saveAnswer()
                questionIndex++
                updateQuestion()
            }
        }

        binding.btSubmit.setOnClickListener {
            saveAnswer()

            val correctAnswers = mapOf(
                0 to 0, // 第一题的正确选项是第0个 ("Paris")
                1 to 1, // 第二题的正确选项是第1个 ("4")
                2 to 0  // 第三题的正确选项是第0个 ("Pacific")
            )
            val score = calculateScore(correctAnswers)
            Toast.makeText(this, "Quiz Submitted! Your score: $score/${questions.size}", Toast.LENGTH_LONG).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun updateQuestion() {
        val currentQuestion = questions[questionIndex]
        val currentOptions = quizData[currentQuestion]!!

        //update question
        binding.tvQuestion.text = currentQuestion

        //update choice
        binding.optionsRadioGroup.removeAllViews()
        currentOptions.forEachIndexed { index, option ->
            val radioButton = RadioButton(this)
            radioButton.id = index
            radioButton.text = option
            radioButton.setTextColor(ContextCompat.getColor(this,R.color.white))
            binding.optionsRadioGroup.addView(radioButton)
        }
        val selectedOption = answers[questionIndex]
        if (selectedOption != null) {
            binding.optionsRadioGroup.check(selectedOption)
        }

        binding.btPrev.isEnabled = questionIndex > 0
        binding.btNext.isEnabled = questionIndex < questions.size - 1
    }
    private fun saveAnswer() {
        val selectedOptionId = binding.optionsRadioGroup.checkedRadioButtonId
        if (selectedOptionId != -1) {
            answers[questionIndex] = selectedOptionId
        }
    }
    private fun calculateScore(correctAnswers: Map<Int, Int>): Int {
        var score = 0
        for ((index, correctOption) in correctAnswers) {
            if (answers[index] == correctOption) {
                score++
            }
        }
        return score
    }
}
