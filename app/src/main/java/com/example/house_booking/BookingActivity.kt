package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.house_booking.R

class BookingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_booking)  // Fixed line

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val dateInput = findViewById<EditText>(R.id.dateInput)
        val confirmButton = findViewById<Button>(R.id.confirmButton)

        confirmButton.setOnClickListener {
            // Navigate to confirmation page
            val intent = Intent(this, ConfirmationActivity::class.java)
            intent.putExtra("name", nameInput.text.toString())
            intent.putExtra("date", dateInput.text.toString())
            startActivity(intent)
        }
    }
}
