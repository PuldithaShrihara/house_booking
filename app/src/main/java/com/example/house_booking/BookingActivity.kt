package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import android.widget.Toast
import com.example.house_booking.R
import com.example.house_booking.payments

class BookingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)

        val nameInput = findViewById<TextInputEditText>(R.id.nameInput)
        val emailInput = findViewById<TextInputEditText>(R.id.emailInput)
        val phoneInput = findViewById<TextInputEditText>(R.id.phoneInput)
        val confirmButton = findViewById<Button>(R.id.confirmButton)

        confirmButton.setOnClickListener {
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val phone = phoneInput.text.toString()

            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                // TODO: Add booking logic here (save to DB or Firebase)
                Toast.makeText(this, "Booking Confirmed!", Toast.LENGTH_SHORT).show()

                // Navigate to PaymentActivity
                val intent = Intent(this, payments::class.java)
                startActivity(intent)
                finish() // optional: close current activity
            }
        }
    }
}
