package com.example.listacontactos.datos

import com.example.listacontactos.R

object DataProvider {
    val contacto =
        Contacto(
            1,
            "Josefina",
            "Tabares",
            604357434,
            "Ejemplo@gmail.com",
            "La abuela",
            R.drawable.abuela
            )
    val listaContacto = mutableListOf(
        contacto,
        Contacto(
            2,
            "Daniel",
            "Tabares",
            604357434,
            "Ejemplo@gmail.com",
            "El abuelo",
            R.drawable.abuelo
        ),
        Contacto(
            3,
            "Jonas",
            "Tabares",
            604357434,
            "Ejemplo@gmail.com",
            "El papa",
            R.drawable.padre
        )
    )
}

