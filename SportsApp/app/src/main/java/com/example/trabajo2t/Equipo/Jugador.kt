package com.example.trabajo2t.Equipo

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Jugador(
    var id: Int,
    var apodo: String,
    var nombre: String,
    var posicion: String,
    var fecha: String,
    var lugar: String,
    var altura: Double,
    var peso: Int,
    var procedencia: String,
    var descripcion: String,
    var foto: String,
    var pos: Int,
    var twitter: String
) : Parcelable
