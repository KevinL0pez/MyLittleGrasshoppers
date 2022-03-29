package com.mispequeossaltamontes.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

            Log.i("Envio", "${miBundle.getInt("ganadores")}")
            campoMensaje.text = "${miBundle.getSerializable("est")} \n" +
                    "Ganadores: ${miBundle.getInt("ganadores")} \n" +
                    "Recuperadores: ${miBundle.getInt("recuperadores")} \n" +
                    "Perdedores: ${miBundle.getInt("perdedores")}"

        }

        val botonSalir: Button = findViewById(R.id.btnSalir)
        botonSalir.setOnClickListener{onClick()}
    }

    private fun onClick() {
        var miBundle:Bundle? = this.intent.extras
        var intent = Intent(this,ActivityRegister::class.java)
        intent.putExtra("gana", miBundle?.getInt("ganadores"))
        intent.putExtra("recupera", miBundle?.getInt("recuperadores"))
        intent.putExtra("pierde", miBundle?.getInt("perdedores"))
        startActivity(intent)
    }
}