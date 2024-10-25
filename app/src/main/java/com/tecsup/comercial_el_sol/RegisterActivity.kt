package com.tecsup.comercial_el_sol

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity: AppCompatActivity() {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var edtUsername: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE)

        edtUsername = findViewById(R.id.edtusername)
        edtEmail = findViewById(R.id.edtemail)
        edtPassword = findViewById(R.id.edtpassword)
        btnRegister = findViewById(R.id.btnregister)

        btnRegister.setOnClickListener {
            val username = edtUsername.text.toString()
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()

            if (username.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                // Guardar los datos de registro en SharedPreferences
                val editor = sharedPreferences.edit()
                editor.putString("username", username)
                editor.putString("email", email)
                editor.putString("password", password)
                editor.putBoolean("isSuperUser", false) // Puedes cambiar a true si es un superusuario
                editor.putBoolean("isLoggedIn", true)
                editor.apply()

                // Redirigir a la pantalla de login
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Completa todos los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}