package com.example.examenparcial.models

import androidx.annotation.DrawableRes

data class Personaje(
    @DrawableRes val imagen: Int,
    val age: Int,
    val genero: String,
    val ocupacion: String,
)