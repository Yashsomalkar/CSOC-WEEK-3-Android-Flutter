package com.yash.todo.AuthActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.yash.todo.R

class Welcome : AppCompatActivity() {
    private lateinit var btnwelcomesignup: Button
    private lateinit var btnwelcomelogin : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        btnwelcomelogin = findViewById(R.id.btnwelcomelogin)
        btnwelcomesignup = findViewById(R.id.btnwelcomesignup)

        btnwelcomesignup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out )
        }
        btnwelcomelogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out )
        }
    }
}