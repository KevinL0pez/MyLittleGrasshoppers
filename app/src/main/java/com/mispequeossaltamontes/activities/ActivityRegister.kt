package com.mispequeossaltamontes.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.mispequeossaltamontes.R
import com.mispequeossaltamontes.clases.Estudiante
import com.mispequeossaltamontes.clases.Globals
import com.mispequeossaltamontes.clases.Operaciones

class ActivityRegister : AppCompatActivity() {
    var campoNombre: EditText? = null
    var campoEdad: EditText? = null
    var campoDireccion: EditText? = null
    var campoTelefono: EditText? = null
    var campoDocumento: EditText? = null
    var campoPrimera: EditText? = null
    var campoSegunda: EditText? = null
    var campoTercera: EditText? = null
    var campoCuarta: EditText? = null
    var campoQuinta: EditText? = null
    var campoUno: EditText? = null
    var campoDos: EditText? = null
    var campoTres: EditText? = null
    var campoCuatro: EditText? = null
    var campoCinco: EditText? = null

    var estudiante:Estudiante ?= null
    var operaciones: Operaciones? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        operaciones = Globals.operaciones

        campoNombre = findViewById(R.id.txtNombre)
        campoEdad = findViewById<EditText?>(R.id.txtEdad)
        campoDireccion = findViewById(R.id.txtDireccion)
        campoDocumento = findViewById(R.id.txtDocumento)
        campoTelefono = findViewById(R.id.txtTelefono)
        campoPrimera = findViewById(R.id.txtPrimeraMateria)
        campoSegunda = findViewById(R.id.txtSegundaMateria)
        campoTercera = findViewById(R.id.txtTerceraMateria)
        campoCuarta = findViewById(R.id.txtCuartaMateria)
        campoQuinta = findViewById(R.id.txtQuintaMateria)
        campoUno = findViewById(R.id.txtPrimeraNotaUno)
        campoDos = findViewById(R.id.txtSegundaNotaUno)
        campoTres = findViewById(R.id.txtTerceraNotaUno)
        campoCuatro = findViewById(R.id.txtCuartaNotaUno)
        campoCinco = findViewById(R.id.txtQuintaNotaUno)

        val miBotonDos: Button = findViewById(R.id.btnEntrarRegistro)
        miBotonDos.setOnClickListener { validarDatos() }

    }

//    private fun salio() {
//
//    }

    private fun validarDatos() {
        //Se instancia la clase operaciones

        var campoPrimeraNota = findViewById<EditText>(R.id.txtPrimeraNotaUno).text.toString()
        var campoSegundaNota = findViewById<EditText>(R.id.txtSegundaNotaUno).text.toString()
        var campoTerceraNota = findViewById<EditText>(R.id.txtTerceraNotaUno).text.toString()
        var campoCuartaNota = findViewById<EditText>(R.id.txtCuartaNotaUno).text.toString()
        var campoQuintaNota = findViewById<EditText>(R.id.txtQuintaNotaUno).text.toString()
        var nombre = findViewById<EditText>(R.id.txtNombre).text.toString()
        var edad = findViewById<EditText>(R.id.txtEdad).text.toString()
        var materiaUno = findViewById<EditText>(R.id.txtPrimeraMateria).text.toString()
        var materiaDos = findViewById<EditText>(R.id.txtSegundaMateria).text.toString()
        var materiaTres = findViewById<EditText>(R.id.txtTerceraMateria).text.toString()
        var materiaCuatro = findViewById<EditText>(R.id.txtCuartaMateria).text.toString()
        var materiaCinco = findViewById<EditText>(R.id.txtQuintaMateria).text.toString()

        // Nota: Validar primero las Notas o números

        if (nombre.equals(null) || nombre.equals("")) {
            campoNombre?.error = "¡Ingresa un nombre!"
        }

        if (edad.equals(null) || edad.equals("")) {
            campoEdad?.error = "¡Ingresa una Edad!"
        }

        if (campoPrimeraNota.equals(null) || campoPrimeraNota.equals("") || campoPrimeraNota.equals(".")) {
            campoUno?.error = "¡Ingresa una nota!"
            if (materiaUno.equals(null) || materiaUno.equals("")) {
                campoPrimera?.error = "¡Ingresa una materia!"
            } else {
                campoPrimera?.setError(null)
            }

        } else if (campoSegundaNota.equals(null) || campoSegundaNota.equals("") || campoSegundaNota.equals(".")) {
            campoUno?.setError(null)
            campoDos?.error = "¡Ingresa una nota!"
            if (materiaDos.equals(null) || materiaDos.equals("")) {
                campoSegunda?.error = "¡Ingresa una materia!"
            } else {
                campoSegunda?.setError(null)
            }

        } else if (campoTerceraNota.equals(null) || campoTerceraNota.equals("") || campoTerceraNota.equals(".")) {
            campoDos?.setError(null)
            campoTres?.error = "¡Ingresa una nota!"
            if (materiaTres.equals(null) || materiaTres.equals("")) {
                campoTercera?.error = "¡Ingresa una materia!"
            } else {
                campoTercera?.setError(null)
            }

        } else if (campoCuartaNota.equals(null) || campoCuartaNota.equals("") || campoCuartaNota.equals(".")) {
            campoTres?.setError(null)
            campoCuatro?.error = "¡Ingresa una nota!"
            if (materiaCuatro.equals(null) || materiaCuatro.equals("")) {
                campoCuarta?.error = "¡Ingresa una materia!"
            } else {
                campoCuarta?.setError(null)
            }

        } else if (campoQuintaNota.equals(null) || campoQuintaNota.equals("") || campoQuintaNota.equals(".")) {
            campoCuatro?.setError(null)
            campoCinco?.error = "¡Ingresa una nota!"
            if (materiaCinco.equals(null) || materiaCinco.equals("")) {
                campoQuinta?.error = "¡Ingresa una materia!"
            } else {
                campoQuinta?.setError(null)
            }

        } else {
            campoCinco?.setError(null)
            var notaUno: Double = campoPrimeraNota.toDouble()
            var notaDos: Double = campoSegundaNota.toDouble()
            var notaTres: Double = campoTerceraNota.toDouble()
            var notaCuatro: Double = campoCuartaNota.toDouble()
            var notaCinco: Double = campoQuintaNota.toDouble()

            if (notaUno > 5 || notaUno < 0) {
                campoUno?.error = "¡El número no puede ser Mayor a 5 y Menor a 0!"

            } else if (notaDos > 5 || notaDos < 0) {
                campoUno?.setError(null)
                campoDos?.error = "¡El número no puede ser Mayor a 5 y Menor a 0!"

            } else if (notaTres > 5 || notaTres < 0) {
                campoDos?.setError(null)
                campoTres?.error = "¡El número no puede ser Mayor a 5 y Menor a 0!"

            } else if (notaCuatro > 5 || notaCuatro < 0) {
                campoTres?.setError(null)
                campoCuatro?.error = "¡El número no puede ser Mayor a 5 y Menor a 0!"
            } else if (notaCinco > 5 || notaCinco < 0) {
                campoCuatro?.setError(null)
                campoCinco?.error = "¡El número no puede ser Mayor a 5 y Menor a 0!"
            } else {
                campoCinco?.setError(null)
                enviarDatos(notaUno, notaDos, notaTres, notaCuatro, notaCinco)
            }
        }
    }

    private fun enviarDatos(
        notaUno: Double,
        notaDos: Double,
        notaTres: Double,
        notaCuatro: Double,
        notaCinco: Double
    ) {

        estudiante=Estudiante()

        estudiante?.documento= campoDocumento?.text.toString()
        estudiante?.nombre=campoNombre?.text.toString()
        estudiante?.edad=campoEdad?.text.toString().toInt()
        estudiante?.direccion=campoDireccion?.text.toString()
        estudiante?.telefono=campoTelefono?.text.toString()

        estudiante?.materia1 = campoPrimera?.text.toString()
        estudiante?.materia2 = campoSegunda?.text.toString()
        estudiante?.materia3 = campoTercera?.text.toString()
        estudiante?.materia4 = campoCuarta?.text.toString()
        estudiante?.materia5 = campoQuinta?.text.toString()

        estudiante?.nota1 = notaUno
        estudiante?.nota2 = notaDos
        estudiante?.nota3 = notaTres
        estudiante?.nota4 = notaCuatro
        estudiante?.nota5 = notaCinco

        estudiante?.promedio=operaciones!!.calcularPromedio(estudiante!!)

        if ((estudiante!!.promedio) >= 3.5 ){
            estudiante?.estado="Aprobado"

        } else{
            estudiante?.estado="Reprobado"
        }

        if(estudiante!!.promedio >= 2.5 ){

            if (estudiante!!.promedio >= 3.5) {
                estudiante?.poRecuperar = false
            } else{
                estudiante?.poRecuperar = true
            }

        } else {
            estudiante?.poRecuperar=false
        }

        operaciones?.registrarEstudiante(estudiante!!)
        operaciones?.imprimirListaEstudiantes()

        val miBundle:Bundle = Bundle()
        miBundle.putString("estado", estudiante?.estado)
        miBundle.putBoolean("poRecuperar", estudiante!!.poRecuperar)
        miBundle.putSerializable("est", estudiante)
        val intent=Intent(this, ActivityPrintDates::class.java)
        intent.putExtras(miBundle)
        startActivity(intent)

    }

}