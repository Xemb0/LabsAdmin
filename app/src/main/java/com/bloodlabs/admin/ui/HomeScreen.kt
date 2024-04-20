package com.bloodlabs.admin.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun HomeScreen() {
    val homeNavController = rememberNavController()
    NavHost(homeNavController, startDestination = "home1") {
        for(i in 1..10) {
            composable("home$i") {

            }
        }
    }
}