package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.house_booking.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.loginButton).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

       /* findViewById<TextView>(R.id.signupPrompt).setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }*/
    }
}
