package com.mispequeossaltamontes.clases

import java.io.Serializable

class Estudiante : Serializable {

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

    var promedio:Double=0.0
    var estado:String=""
    var poRecuperar:Boolean=false

    override fun toString(): String {
        return  "Nombre: $nombre \n" +
                "Documento: $documento " +
                "Edad: $edad \n" +
                "Telefono: $telefono \n" +
                "Direccion: $direccion \n" +
                "Materia1: $materia1 - Nota1: $nota1\n" +
                "Materia2: $materia2 - Nota2: $nota2\n" +
                "Materia3: $materia3 - Nota3: $nota3\n" +
                "Materia4: $materia4 - Nota4: $nota4\n" +
                "Materia5: $materia5 - Nota5: $nota5\n" +
                "Promedio: $promedio \n\n" +
                "Estado: $estado"
    }
}