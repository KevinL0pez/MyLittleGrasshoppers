package com.mispequeossaltamontes.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.mispequeossaltamontes.R
import com.mispequeossaltamontes.clases.Estudiante
import com.mispequeossaltamontes.clases.Operaciones

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarComponentes()

    }

    private fun iniciarComponentes() {
        val botonRegister: Button = findViewById(R.id.btnRegitrar)
        val botonStatistics: Button = findViewById(R.id.btnEstadisticas)
        val botonSupport: Button = findViewById(R.id.btnAyuda)
        botonRegister.setOnClickListener{onClick(1)}
        botonStatistics.setOnClickListener{onClick(2)}
        botonSupport.setOnClickListener{onClick(3)}
    }

    private fun onClick(boton: Int) {

        when(boton) {
            1 -> { startActivity(Intent(this,ActivityRegister::class.java)) }
            2 -> { startActivity(Intent(this,ActivityStatistics::class.java)) }
            3 -> { startActivity(Intent(this, ActivitySupport::class.java)) }
        }
    }
}