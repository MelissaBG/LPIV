package com.example.loginactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun Intent.change(){
        startActivity(this)
        finish()
    }
}