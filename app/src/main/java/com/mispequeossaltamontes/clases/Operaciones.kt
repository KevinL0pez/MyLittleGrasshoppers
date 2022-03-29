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

//    fun calcularPromedio(est: Estudiante): Double {
//
//        var contPierde: Double = 0.0
//        var contGana: Double = 0.0
//        var contRecupera: Double = 0.0
//        var mensaje: String = ""
//
//        var prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota5)/5
//        est.promedio=prom
//
//        if (prom <= 2.5) {
//            contPierde ++
//            mensaje =  "Pierde la materia"
//
//        } else if (prom < 3.5 && prom >= 2.5){
//            contRecupera ++
//            mensaje = "Puede recuperar"
//
//        } else {
//            contGana ++
//            mensaje = "Gana la materia"
//        }
//
//        est.conclusion = mensaje
//        est.pierde = contPierde
//        est.recupera = contRecupera
//        est.gana = contGana
//        return prom
//    }


}