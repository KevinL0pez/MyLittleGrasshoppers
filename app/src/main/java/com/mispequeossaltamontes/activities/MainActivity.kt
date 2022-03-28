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
    var operaciones: Operaciones? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        operaciones = Operaciones()

        iniciarComponentes()

    }

    private val response=registerForActivityResult(ActivityResultContracts.StartActivityForResult()){ valor ->
        if (valor.resultCode== RESULT_OK){
            //resp y resp 2 almacenan el mismo dato, solo se muestran 2 formas como podria capturarse el dato
            val resp=valor?.data?.extras?.get("resultado") as String
            val resp2=valor?.data?.getStringExtra("resultado")
            println("Valor respuesta=$resp y la resps2=$resp2")
            //capturamos el objeto nuevo y lo asignamos a operaciones
            operaciones= valor?.data?.extras?.get("objetoOperaciones") as Operaciones?
            operaciones?.imprimirListaEstudiantes()
        }
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
            1 -> {
                var miIntent:Intent= Intent(this,ActivityRegister::class.java)

                var miBundle:Bundle= Bundle()
                miBundle.putSerializable("operaciones",operaciones)

                miIntent.putExtras(miBundle)
                miIntent.putExtra("Objeto",operaciones)
                // startActivity(miIntent) -> Es importante tener presente que al momento
                // de invocar la actividad de registro no se llama al starActivity(), sino
                // que se hace mediante response.launch(miIntent)
                response.launch(miIntent)
            }
            2 -> { startActivity(Intent(this,ActivityStatistics::class.java)) }
            3 -> { startActivity(Intent(this, ActivitySupport::class.java)) }
        }
    }
}