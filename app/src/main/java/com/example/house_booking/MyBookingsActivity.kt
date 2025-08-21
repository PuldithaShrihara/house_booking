package com.example.bookingapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.house_booking.R

class MyBookingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mybookings) // Your MyBookings XML layout

        val btnAddBooking = findViewById<Button>(R.id.btnAddBooking)
        btnAddBooking.setOnClickListener {
            // Navigate back to BookNow screen to add new booking
            finish() // Or startActivity(Intent(this, BookNowActivity::class.java))
        }
    }
}
