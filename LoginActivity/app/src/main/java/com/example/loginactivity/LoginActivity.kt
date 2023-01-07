package com.example.loginactivity

import HomeActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonClick = findViewById<Button>(R.id.button_clickLogin)
        buttonClick.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
        findViewById<TextView>(R.id.text).setOnClickListener {
            showToast()
            showSnackBar()
        }
    }

    private fun showToast() {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }


    private fun showSnackBar() {
        val container = findViewById<ConstraintLayout>(R.id.container)

        findViewById<TextView>(R.id.textViewHome).apply {
            setOnClickListener {
                Snackbar
                    .make(container, "Nosso SnackBar", Snackbar.LENGTH_LONG)
                    .setAction("oK") {
                        val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                        startActivity(intent)
                    }
                    .show()
            }
        }
    }
}