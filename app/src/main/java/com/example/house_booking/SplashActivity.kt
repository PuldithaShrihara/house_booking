package com.example.housebookingapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.house_booking.R
import com.example.house_booking.onboarding  // import your onboarding activity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            // Open Onboarding instead of Login
            startActivity(Intent(this, onboarding::class.java))
            finish()
        }, 2000)
    }
}
