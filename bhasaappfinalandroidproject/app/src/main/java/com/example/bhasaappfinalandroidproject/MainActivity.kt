package com.example.bhasaappfinalandroidproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var edUsername : EditText
    private lateinit var edPassword : EditText
    private lateinit var btnLogin : Button
    private lateinit var btnForgot : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}