package com.example.iacworkshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoToLogin = findViewById<Button>(R.id.btnGoToLogin)

        btnGoToLogin.setOnClickListener {
            //intent
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}