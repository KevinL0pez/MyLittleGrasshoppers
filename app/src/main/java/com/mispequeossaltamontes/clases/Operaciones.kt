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

        var prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota5)/5

        return prom
    }


}