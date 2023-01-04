package com.example.loginactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompact
import android.Window
import android.WindowManager
import android.os.Build
import android.view.Window
import android.view.WindowManager
import androidx.annotation.ColorInt
import androidx.annotation.RequiresApi

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Muda a cor da estatus bar
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU){
            window.statusBarColor(R.color.colorPrimary)
        }
    }
    //Fazendo uma requisição. Verifica se a verção é superior.
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun Window.setStatusBarColorTo(color: Int){
        this.ClearFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        this.addFlags(windowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        this.statusBarColor = contexCompact.getColor(baseContext, color)
    }
}