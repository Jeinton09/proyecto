package com.tecsup.comercial_el_sol

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class PrincipalActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val actionBar = supportActionBar

        actionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Home"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_drawer, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_calculator -> {
                //ejecutamos la accion
            }
        }
        return super.onOptionsItemSelected(item)
    }
}