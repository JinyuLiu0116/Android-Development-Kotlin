package com.example.finalproject

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.finalproject.databinding.ActivityMainBinding

private const val TAG = "MainActivity: "
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val frag1 = Fragment_sign_in()
        val frag2 = Fragment_sign_up()

        binding.btSingIn.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, frag1)
                commit()
            }
        }

        binding.btSingUp.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, frag2)
                commit()
            }
        }

        binding.btNext.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    /*private fun replaceFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(binding.fragmentContainerView.id, fragment)
            .commit()
    }*/
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

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG,"onRestoreInstanceState is called")

    }
}
