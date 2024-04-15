package com.example.examenparcial.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavManager() {
    var navHostController: NavHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = "Personajes") {
        composable(route = "Personajes") {
            PersonajesView(navHostController)
        }
        composable(route = "Personajes/Nuevo") {
            NuevoPersonajeView(navHostController)
        }
    }
}