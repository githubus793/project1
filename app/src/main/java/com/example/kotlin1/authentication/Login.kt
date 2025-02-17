package com.example.kotlin1.authentication

import android.content.Intent
import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin1.R
import com.example.kotlin1.databinding.ActivityLoginBinding
import com.example.kotlin1.ui.Home

class Login : AppCompatActivity() {
    /// linking the login xml to login activity.kt

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        /// navigation and action rom the button to the home  page

        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
            Toast.makeText(this,"you are navigating to home page ",Toast.LENGTH_SHORT).show()
            finish()

        }
        binding.tvRegister.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
            Toast.makeText(this,"you are navigating to register page",Toast.LENGTH_SHORT).show()
            finish()
        }

    }

}