package com.mispequeossaltamontes.activities

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

    var operaciones: Operaciones? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var bundle: Bundle? =this.intent.extras
        operaciones= bundle?.getSerializable("operaciones") as Operaciones?

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

//        val miBoton: Button = findViewById(R.id.btnSalirRegistro)
//        miBoton.setOnClickListener { salio() }

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

        var est: Estudiante = Estudiante()
        var bundle:Bundle? = this.intent.extras

        est.documento= campoDocumento?.text.toString()
        est.nombre=campoNombre?.text.toString()
        est.edad=campoEdad?.text.toString().toInt()
        est.direccion=campoDireccion?.text.toString()
        est.telefono=campoTelefono?.text.toString()

        est.materia1 = campoPrimera?.text.toString()
        est.materia2 = campoSegunda?.text.toString()
        est.materia3 = campoTercera?.text.toString()
        est.materia4 = campoCuarta?.text.toString()
        est.materia5 = campoQuinta?.text.toString()

        est.nota1= notaUno
        est.nota2= notaDos
        est.nota3= notaTres
        est.nota4= notaCuatro
        est.nota5= notaCinco

        var contPierde: Int = 0
        var contGana: Int = 0
        var contRecupera: Int = 0
        var mensaje: String = ""
        var prom: Double = 0.0

        prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota5)/5

        if (prom <= 2.5) {
            contPierde += 1
            Log.i("Recupera", bundle?.getInt("pierde").toString())
            mensaje =  "Pierde la materia"

        } else if (prom < 3.5 && prom >= 2.5){
            contRecupera += 1
            Log.i("Recupera", bundle?.getInt("recupera").toString())
            mensaje = "Puede recuperar"

        } else {
            contGana += 1
            Log.i("Gana", bundle?.getInt("gana").toString())
            mensaje = "Gana la materia"
        }

        contGana += bundle?.getInt("gana")!!.toInt()
        contRecupera += bundle?.getInt("recupera")!!.toInt()
        contPierde += bundle?.getInt("pierde")!!.toInt()
        est.conclusion = mensaje
        est.pierde = contPierde
        est.recupera = contRecupera
        est.gana = contGana
        est.promedio = prom
//        est.promedio = operaciones!!.calcularPromedio(est)
        operaciones?.registrarEstudiante(est)
        operaciones?.imprimirListaEstudiantes()

//        var miBundle:Bundle=Bundle()
//        miBundle.putSerializable("est", est)
//        intent.putExtras(miBundle)

        intent= Intent(this,ActivityPrintDates::class.java)
        intent.putExtra("ganadores", contGana)
        intent.putExtra("recuperadores", contRecupera)
        intent.putExtra("perdedores", contPierde)
        startActivity(intent)

    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode==KeyEvent.KEYCODE_BACK){
            Toast.makeText(this, "Se cierra el Activity Register", Toast.LENGTH_SHORT).show()
            devolverResultados()
            startActivity(Intent(this, MainActivity::class.java))
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun devolverResultados() {
        var miIntent: Intent = Intent()
        miIntent.putExtra("resultado","Registro exitoso")
        var miBundle:Bundle= Bundle()
        miBundle.putSerializable("objetoOperaciones",operaciones)
        miIntent.putExtras(miBundle)
        //miIntent.putExtra("obj",operaciones)
        setResult(RESULT_OK,miIntent)
    }


}