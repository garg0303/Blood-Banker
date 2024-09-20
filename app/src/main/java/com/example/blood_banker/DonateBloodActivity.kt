package com.example.blood_banker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DonateBloodActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donate_blood)

        val etDonorName = findViewById<EditText>(R.id.etDonorName)
        val etBloodGroup = findViewById<EditText>(R.id.etBloodGroup)
        val etLocation = findViewById<EditText>(R.id.etLocation)
        val btnSchedule = findViewById<Button>(R.id.btnSchedule)

        btnSchedule.setOnClickListener {
            val donorName = etDonorName.text.toString()
            val bloodGroup = etBloodGroup.text.toString()
            val location = etLocation.text.toString()

            // Handle scheduling logic (e.g., save to database or send to server)
            Toast.makeText(this, "Appointment Scheduled!", Toast.LENGTH_SHORT).show()
        }
    }
}