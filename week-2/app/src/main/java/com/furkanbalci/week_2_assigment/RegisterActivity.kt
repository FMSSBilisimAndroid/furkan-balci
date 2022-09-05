package com.furkanbalci.week_2_assigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.furkanbalci.week_2_assigment.data.DataHandler
import com.furkanbalci.week_2_assigment.data.User
import com.furkanbalci.week_2_assigment.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    //Binding for
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Binding initialize.
        binding = ActivityRegisterBinding.inflate(layoutInflater)

        //Set binding root in content view.
        setContentView(binding.root)

        //Run initialize.
        this.initialize()
    }

    private fun initialize() {

        //If clicked on register button.
        binding.registerButton.setOnClickListener {

            //Bu ödevde önemli olan konu tasarım olduğu için gerekli kontrolleri yapmadım.

            //Gets all taken info.
            val mail = binding.editEmail.text.toString()
            val password = binding.editPassword.text.toString()
            val username = binding.editUsername.text.toString()

            //Create new user.
            val user = User(mail, username, password)

            //Set current user.
            DataHandler.currentUser = user

            Toast.makeText(this, "Başarıyla kayıt oldunuz!", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }


}