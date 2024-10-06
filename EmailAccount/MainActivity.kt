package com.example.email

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.email.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val emailAccount = mapOf(
        "Jinyu@gmail.com" to "12345",
        "Ikura@gmail.com" to "13579",
        "Ayass@gmail.com" to "24680"
    )
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bSubmit.setOnClickListener{
            val email = binding.textEmail.text.toString()
            val password = binding.textPassword.text.toString()
            if(email.isEmpty()) {
                binding.errorMassage.text = "Please enter your email"
                binding.errorMassage.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_light))
            }
            else if(password.isEmpty()) {
                binding.errorMassage.text = "Please enter your password"
                binding.errorMassage.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_light))
            }
            else if(emailAccount.containsKey(email) && emailAccount[email] == password){
                binding.errorMassage.text = "Your are login"
                binding.errorMassage.setTextColor(ContextCompat.getColor(this, android.R.color.holo_green_light))
            }
            else{
                binding.errorMassage.text = "Invalid email or password"
                binding.errorMassage.setTextColor(ContextCompat.getColor(this, android.R.color.holo_red_light))
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
