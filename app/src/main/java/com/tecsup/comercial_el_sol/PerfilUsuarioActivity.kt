package com.tecsup.comercial_el_sol

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PerfilUsuarioActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario) // Nombre del archivo XML de perfil

        // Configuración del botón de retroceso
        val backButton: ImageView = findViewById(R.id.back)
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java) // Intent hacia MainActivity
            startActivity(intent)
            finish() // Finaliza la actividad actual
        }
    }
}