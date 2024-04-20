package com.bloodlabs.admin.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun UsersScreen() {
    val chatNavController = rememberNavController()
    NavHost(chatNavController, startDestination = "chat1") {
        for(i in 1..10) {
            composable("chat$i") {

            }
        }
    }
}
