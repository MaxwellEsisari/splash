package com.example.splash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.splash.databinding.ActivityMainSignupBinding

class MainSignup : AppCompatActivity() {
    private lateinit var binding: ActivityMainSignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainSignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar!!.hide()
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
    }
}