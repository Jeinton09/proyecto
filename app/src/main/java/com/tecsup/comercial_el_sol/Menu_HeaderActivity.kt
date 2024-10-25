package com.tecsup.comercial_el_sol

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Menu_HeaderActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_header_main) // Nombre del archivo XML de la actividad

        // Configuración de ImageView para redirigir a la actividad de perfil
        val imageUser: ImageView = findViewById(R.id.imageuser)  // Asegúrate de usar el id correcto
        imageUser.setOnClickListener {
            val intent = Intent(this, PerfilUsuarioActivity::class.java) // Intent hacia PerfilUsuarioActivity
            startActivity(intent)
        }
    }
}