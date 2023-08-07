package com.example.mad_practical4_21012011118

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val loginTxt:TextView = findViewById(R.id.loginText)

        loginTxt.setOnClickListener {
            Intent(this@RegistrationActivity,LoginActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}