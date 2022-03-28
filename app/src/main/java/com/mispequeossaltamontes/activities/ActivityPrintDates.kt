package com.mispequeossaltamontes.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mispequeossaltamontes.R

class ActivityPrintDates : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_dates)

        val campoMensaje = findViewById<TextView>(R.id.txtResultado)

        var miBundle:Bundle? = this.intent.extras

        if (miBundle != null) {

            campoMensaje.text = "${miBundle.getSerializable("est")}"

        }

        val botonSalir: Button = findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{onClick()}
    }

    private fun onClick() {
        finish()
    }
}