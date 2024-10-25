package com.tecsup.comercial_el_sol

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout

class HomeActivity: AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var userDrawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        drawerLayout = findViewById(R.id.drawer_layout)

        // Inicializar el botón del menú hamburguesa
        val menuButton: ImageView = findViewById(R.id.usermenu)

        // Configurar el clic para abrir/cerrar el menú lateral
        menuButton.setOnClickListener {
            if (drawerLayout.isDrawerOpen(findViewById(R.id.nav_view))) {
                drawerLayout.closeDrawer(findViewById(R.id.nav_view))
            } else {
                drawerLayout.openDrawer(findViewById(R.id.nav_view))
            }
        }
    }
}