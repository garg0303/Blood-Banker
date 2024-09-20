package com.example.blood_banker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EmergencyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)

        val etEmergencyDetails = findViewById<EditText>(R.id.etEmergencyDetails)
        val btnSendEmergency = findViewById<Button>(R.id.btnSendEmergency)

        btnSendEmergency.setOnClickListener {
            val details = etEmergencyDetails.text.toString()

            // Handle emergency request logic (e.g., send details to a server or notify contacts)
            Toast.makeText(this, "Emergency Request Sent!", Toast.LENGTH_SHORT).show()
        }
    }
}