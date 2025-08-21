package com.example.bookingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.example.house_booking.R
//import com.example.housebookingapp.MyBookingsActivity

class otpVerification : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_verification) // Your OTP XML layout

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton.setOnClickListener { onBackPressed() }

        val otpEditText = findViewById<EditText>(R.id.otpEditText)
        val verifyOtpButton = findViewById<Button>(R.id.verifyOtpButton)

        verifyOtpButton.setOnClickListener {
            val otp = otpEditText.text.toString()
            if (otp.length == 6) {
                // TODO: Verify OTP with backend
                Toast.makeText(this, "OTP Verified!", Toast.LENGTH_SHORT).show()

                // Navigate to MyBookings
                val intent = Intent(this, MyBookingsActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Enter valid 6-digit OTP", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
