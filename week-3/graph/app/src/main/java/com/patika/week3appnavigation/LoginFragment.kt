package com.patika.week3appnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.patika.week3appnavigation.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {

            //Get edit texts.
            val username = binding.editTextUsername
            val password = binding.editTextPassword

            //If username and password are not empty.
            if (username.text.isNotEmpty() && password.text.isNotEmpty()) {
                //Navigate action.
                findNavController().navigate(R.id.action_loginFragment_to_mainActivity)
            } else {
                //Show snackbar.
                Snackbar.make(view, "Bir hata yaptınız!", Snackbar.LENGTH_LONG).show()
            }
        }

    }
}