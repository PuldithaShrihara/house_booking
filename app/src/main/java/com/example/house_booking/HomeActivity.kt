package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.house_booking.R

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val scrollArea = findViewById<View>(R.id.scrollArea)

        // Loop through all boxes (GridLayout children) to set click listener
        val gridLayout = (scrollArea as View).findViewById<android.widget.GridLayout>(R.id.scrollArea)
        for (i in 0 until gridLayout.childCount) {
            val box = gridLayout.getChildAt(i)
            box.setOnClickListener {
                val intent = Intent(this, DetailActivity::class.java)
                // Pass hotel info if needed (example: index)
                intent.putExtra("hotelIndex", i)
                startActivity(intent)
            }
        }
    }
}
