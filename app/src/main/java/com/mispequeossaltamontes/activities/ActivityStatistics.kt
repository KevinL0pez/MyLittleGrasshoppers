package com.mispequeossaltamontes.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mispequeossaltamontes.R
import com.mispequeossaltamontes.clases.Operaciones

class ActivityStatistics : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistics)

        val miBoton: Button = findViewById(R.id.btnSalirEstadisticas)
        miBoton.setOnClickListener{onSalir()}

        val campoMensaje = findViewById<TextView>(R.id.txtResultado)

        var miBundle:Bundle? = this.intent.extras

        if (miBundle != null) {

            campoMensaje.text = "${miBundle.getSerializable("est")}"

        }

    }

    private fun onSalir() {
        finish()
    }
}