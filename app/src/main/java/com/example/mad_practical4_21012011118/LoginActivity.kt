package com.example.mad_practical4_21012011118

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpTxt: TextView = findViewById(R.id.signUpText)

        signUpTxt.setOnClickListener {
            Intent(this@LoginActivity, RegistrationActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}