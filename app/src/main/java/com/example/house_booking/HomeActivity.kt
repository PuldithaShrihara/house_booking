package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.house_booking.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<CardView>(R.id.houseCard1).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
