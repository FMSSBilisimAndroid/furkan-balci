package com.furkanbalci.week_2_assigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.furkanbalci.week_2_assigment.databinding.ActivityRegisterBinding
import com.furkanbalci.week_2_assigment.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Binding initialize.
        binding = ActivitySplashBinding.inflate(layoutInflater)

        //Set binding root in content view.
        setContentView(binding.root)

        //Run initialize.
        this.initialize()
    }

    private fun initialize() {

        //If clicked on join button.
        binding.button.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }

}