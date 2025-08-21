package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.house_booking.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val hotelName = findViewById<TextView>(R.id.hotelName)
        val hotelImage = findViewById<ImageView>(R.id.hotelImage)
        val hotelPrice = findViewById<TextView>(R.id.hotelPrice)
        val bookButton = findViewById<Button>(R.id.bookButton)

        // Optionally get hotel index
        val index = intent.getIntExtra("hotelIndex", 0)

        // TODO: You can customize hotel info based on index

        bookButton.setOnClickListener {
            val intent = Intent(this, BookingActivity::class.java)
            startActivity(intent)
        }
    }
}
