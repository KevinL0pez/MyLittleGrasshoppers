package com.mispequeossaltamontes.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mispequeossaltamontes.R

class ActivitySupport : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_support)

        val miBoton: Button = findViewById(R.id.btnSalirAyuda)
        miBoton.setOnClickListener{salir()}

    }

    private fun salir() {
        finish()
    }
}