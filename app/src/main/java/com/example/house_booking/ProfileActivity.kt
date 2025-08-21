package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.example.house_booking.R
import com.example.house_booking.edit_profile

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profileName = findViewById<TextView>(R.id.profileName)
        val profileEmail = findViewById<TextView>(R.id.profileEmail)
        val editProfileButton = findViewById<Button>(R.id.editProfileButton)

        editProfileButton.setOnClickListener {
            val intent = Intent(this, edit_profile::class.java)
            intent.putExtra("name", profileName.text.toString())
            intent.putExtra("email", profileEmail.text.toString())
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        // Optional: Refresh profile info after returning from EditProfileActivity
    }
}
