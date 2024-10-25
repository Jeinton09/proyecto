package com.tecsup.comercial_el_sol

import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.tecsup.comercial_el_sol.R.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnsesion = findViewById<Button>(R.id.btnsesion)
        val btnRegister = findViewById<Button>(R.id.btnregister)

        val edtEmail = findViewById<TextInputEditText>(R.id.edtemail)
        val edtPassword = findViewById<TextInputEditText>(R.id.edtpassword)

        btnsesion.setOnClickListener {
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty()){

                startActivity(Intent(this, HomeActivity::class.java))
            }else{
                Toast.makeText(this, "Campos vacios", Toast.LENGTH_SHORT).show()
            }
        }

        btnRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}