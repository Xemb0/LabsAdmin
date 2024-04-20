//package com.bloodlabs.admin.ui
//
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.navigation
//import androidx.navigation.compose.rememberNavController
//import com.bloodlabs.admin.database.NavViewModel
//
//class Screens {
//    BloodlabsTheme {
//        val navController = rememberNavController()
//        NavHost(navController = navController,startDestination = "home"){
//            navigation(
//                startDestination = "login",
//                route = "auth"
//            ){
//                composable("login"){
//                    val viewModel = it.sharedViewModel<NavViewModel>(navController)
//
//                    Button(onClick = {
//                        navController.navigate("main"){
//                            popUpTo("auth"){
//                                inclusive = true
//                            }
//                        }
//                    }){
//                        Text("Move to home")
//                    }
//                }
//                composable("otp"){
//                    val viewModel = it.sharedViewModel<NavViewModel>(navController)
//
//                }
//            }
//            navigation(
//                startDestination = "home",
//                route = "main"
//            ){
//                composable("home"){
//                    val viewModel = it.sharedViewModel<NavViewModel>(navController)
//                }
//                composable("profile"){
//                    val viewModel = it.sharedViewModel<NavViewModel>(navController)
//                }
//            }
//        }
//    }
//}