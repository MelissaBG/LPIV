package com.example.splashactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)

        new Handler().postDelayed(new Runable(){
            public void run(){
    startActivity(new Intent(MainActivity.this, SplashActivity.class))
                finish();
            }
        }, 3000)
        setContentView(R.layout.activity_main)
    }
}