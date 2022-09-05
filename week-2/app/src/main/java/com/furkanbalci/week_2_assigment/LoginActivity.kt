package com.furkanbalci.week_2_assigment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.furkanbalci.week_2_assigment.data.DataHandler
import com.furkanbalci.week_2_assigment.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Binding initialize.
        binding = ActivityLoginBinding.inflate(layoutInflater)

        //Set binding root in content view.
        setContentView(binding.root)

        //Run initialize.
        this.initialize()
    }

    private fun initialize() {

        //If clicked on create account text.
        binding.createAccountText.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        //If clicked on login button.
        binding.loginButton.setOnClickListener {

            val username = binding.editUsername.text.toString()
            val password = binding.editPassword.text.toString()

            val currentUser = DataHandler.currentUser

            //If current user is empty.
            if (currentUser == null) {
                Toast.makeText(this, "Kayıtlı bir kullanıcı bulunamadı!", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            //If user or password incorrect.
            if (!(username contentEquals currentUser.username && password contentEquals currentUser.password)) {
                Toast.makeText(this, "Kullanıcı adı veya şifreniz hatalı!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Başarıyla giriş yaptınız!", Toast.LENGTH_SHORT).show()
        }
    }

}