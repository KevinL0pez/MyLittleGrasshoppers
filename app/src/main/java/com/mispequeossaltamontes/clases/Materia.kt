package com.mispequeossaltamontes.clases

import java.io.Serializable

class Materia(nombre:String, nota:Double) : Serializable{

    var nombreMateria:String=nombre
    var promedioMateria:Double=nota

    override fun toString(): String {
        return "Materia(nombreMateria='$nombreMateria', promedioMateria=$promedioMateria)"
    }

}