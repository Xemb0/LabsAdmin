package com.bloodlabs.admin.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bloodlabs.admin.ui.uploads.Uploads

@Composable
fun HomeScreen() {
    val homeNavController = rememberNavController()
    NavHost(homeNavController, startDestination = "home1") {
            composable("home1") {
                Uploads(homeNavController)
        }
    }
}