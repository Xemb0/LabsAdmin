package com.bloodlabs.admin.ui

import android.annotation.SuppressLint
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.bloodlabs.admin.theme.BloodlabsThemeComposable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(){
BloodlabsThemeComposable {
    val rootNavController = rememberNavController()
    val navBackStackEntry by rootNavController.currentBackStackEntryAsState()

    Scaffold(
        bottomBar = {
            NavigationBar {
                items.forEach {
                    val isSelected = it.title.lowercase() ==
                            navBackStackEntry?.destination?.route?.lowercase()
                    NavigationBarItem(
                        selected = isSelected,
                        label = {
                            Text(text = it.title)
                        },
                        icon = {
                            Icon(
                                imageVector = if (isSelected) {
                                    it.selectedIcon
                                } else it.unselectedIcon,
                                contentDescription = it.title
                            )
                        },
                        onClick = {
                            rootNavController.navigate(it.title) {
                                popUpTo(rootNavController.graph.startDestinationId) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) {
        NavHost(rootNavController, startDestination = "home") {
            composable("users") {
                UsersScreen()
            }
            composable("home") {
                HomeScreen()
            }
            composable("settings") {
                SettingsScreen()
            }
        }
    }
}
}
