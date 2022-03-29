package com.mispequeossaltamontes.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.mispequeossaltamontes.R
import com.mispequeossaltamontes.clases.Estudiante
import com.mispequeossaltamontes.clases.Operaciones

class ActivityPrintDates : AppCompatActivity() {
    var btnInicio:Button?=null
    var estudiante: Estudiante?= null
    var operaciones: Operaciones? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_dates)

        val campoMensaje = findViewById<TextView>(R.id.txtResultado)
        val campoEstado = findViewById<TextView>(R.id.txtEstado)
        var miBundle:Bundle? = this.intent.extras

        btnInicio = findViewById(R.id.btnSalir)

        if (miBundle != null) {
            campoMensaje.text = "${miBundle.getSerializable("est")}"

            if(miBundle.getString("estado")=="Aprobado"){

            }else{
                when (miBundle.getBoolean("poRecuperar")){
                    true -> campoEstado?.setText("Con posibilidades de recuperar la Materia")
                    false -> campoEstado?.setText("Sin posibilidades de recuperar la Materia")
                }
            }

        }
        btnInicio?.setOnClickListener { startActivity(Intent(this, MainActivity::class.java)) }

    }


}