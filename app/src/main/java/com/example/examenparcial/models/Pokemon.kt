package com.example.examenparcial.models

import androidx.annotation.DrawableRes

data class Pokemon(
    @DrawableRes val imagen: Int,
    val nombre: String
)