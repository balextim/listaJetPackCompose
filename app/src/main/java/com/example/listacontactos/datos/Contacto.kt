package com.example.listacontactos.datos

import java.io.Serializable

data class Contacto(
    val id: Int,
    val nombre: String,
    val apellido: String,
    val numero: Int,
    val correo: String,
    val descripcion: String,
    val idImagen: Int = 0
): Serializable
