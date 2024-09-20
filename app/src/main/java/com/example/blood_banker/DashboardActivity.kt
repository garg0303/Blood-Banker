package com.example.blood_banker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnDonateBlood = findViewById<Button>(R.id.btnDonateBlood)
        val btnEmergency = findViewById<Button>(R.id.btnEmergency)

        btnDonateBlood.setOnClickListener {
            val intent = Intent(this, DonateBloodActivity::class.java)
            startActivity(intent)
        }

        btnEmergency.setOnClickListener {
            val intent = Intent(this, EmergencyActivity::class.java)
            startActivity(intent)
        }
    }
}