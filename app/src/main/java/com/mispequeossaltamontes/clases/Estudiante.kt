package com.mispequeossaltamontes.clases

import java.io.Serializable

class Estudiante : Serializable {

    var conclusion: String = ""
    var pierde: Int = 0
    var gana: Int = 0
    var recupera: Int = 0
    var documento: String=""
    var nombre: String=""
    var edad: Int=0
    var telefono: String=""
    var direccion: String=""

    var materia1: String=""
    var materia2: String=""
    var materia3: String=""
    var materia4: String=""
    var materia5: String=""

    var nota1: Double=0.0
    var nota2: Double=0.0
    var nota3: Double=0.0
    var nota4: Double=0.0
    var nota5: Double=0.0

    //Este mapa es opcional, es un ejemplo por si se va a gestionar las notas de forma independiente
//    var mapaMaterias= mutableMapOf<String,Materia>()

    var promedio:Double=0.0

    override fun toString(): String {
        return "Estudiante \n " +
                "documento='$documento', nombre='$nombre'," +
                "Edad: $edad, Telefono: $telefono Direccion: $direccion" +
                "Materia1: $materia1, Materia2: $materia2 " +
                "Materia3: $materia3, Materia4: $materia4 \n " +
                "Materia5: $materia5, \n" +
                "Nota1: $nota1, nota2: $nota2, nota3: $nota3, nota4: $nota4, Nota5: $nota5 \n" +
                "Promedio: $promedio) \n" +
                "Pierden: $pierde \n" +
                "Ganan: $gana \n" +
                "Recuperan: $recupera \n" +
                "Conclusión: $conclusion \n"
    }
}