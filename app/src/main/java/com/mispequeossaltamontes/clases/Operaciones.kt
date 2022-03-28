package com.mispequeossaltamontes.clases

import java.io.Serializable

class Operaciones : Serializable {


    var listaEstudiantes =arrayListOf<Estudiante>()

    fun registrarEstudiante(estudiante: Estudiante){

        listaEstudiantes.add(estudiante)
    }

    fun imprimirListaEstudiantes(){
        for(est in listaEstudiantes){
            println(est)
        }
    }

    fun calcularPromedio(est: Estudiante): Double {

        var contPierde: Int = 0
        var contGana: Int = 0
        var contRecupera: Int = 0
        var mensaje: String = ""

        var prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota5)/5
        est.promedio=prom

        if (prom <= 2.5) {
            contPierde = contPierde + 1
            mensaje =  "Pierde la materia"

        } else if (prom < 3.5 && prom >= 2.5){
            contRecupera = contRecupera + 1
            mensaje = "Puede recuperar"

        } else {
            contGana = contGana + 1
            mensaje = "Gana la materia"
        }

        est.conclusion = mensaje
        est.pierde = contPierde
        est.gana = contGana
        est.recupera = contRecupera
        return prom
    }


}