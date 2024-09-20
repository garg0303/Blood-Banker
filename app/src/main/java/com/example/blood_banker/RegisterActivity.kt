package com.example.blood_banker

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    private lateinit var etRegisterUsername: EditText
    private lateinit var etRegisterPassword: EditText
    private lateinit var btnRegisterSubmit: Button
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize the views
        etRegisterUsername = findViewById(R.id.etRegisterUsername)
        etRegisterPassword = findViewById(R.id.etRegisterPassword)
        btnRegisterSubmit = findViewById(R.id.btnRegisterSubmit)

        // Initialize the SharedPreferences
        sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)

        btnRegisterSubmit.setOnClickListener {
            val username = etRegisterUsername.text.toString()
            val password = etRegisterPassword.text.toString()

            // Store the credentials in SharedPreferences
            sharedPreferences.edit().putString("username", username).putString("password", password).apply()

            // Simulate registration (in a real app, save credentials to a server or database)
            Toast.makeText(this, "User registered successfully!", Toast.LENGTH_SHORT).show()

            // Redirect to sign-in screen after registration
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}