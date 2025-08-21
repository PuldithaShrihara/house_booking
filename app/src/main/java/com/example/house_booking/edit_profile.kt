package com.example.housebookingapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.house_booking.R

class edit_profile: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        val editName = findViewById<EditText>(R.id.editProfileName)
        val editEmail = findViewById<EditText>(R.id.editProfileEmail)
        val editPhone = findViewById<EditText>(R.id.editProfilePhone)
        val saveButton = findViewById<Button>(R.id.saveProfileButton)

        // Populate fields from intent
        editName.setText(intent.getStringExtra("name"))
        editEmail.setText(intent.getStringExtra("email"))

        // Go back to Profile without saving
        backButton.setOnClickListener {
            finish()
        }

        // Save changes and return to Profile
        saveButton.setOnClickListener {
            val name = editName.text.toString()
            val email = editEmail.text.toString()
            val phone = editPhone.text.toString()

            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                // TODO: Save changes to database / shared preferences
                Toast.makeText(this, "Profile updated successfully!", Toast.LENGTH_SHORT).show()
                finish() // Go back to ProfileActivity
            }
        }
    }
}
