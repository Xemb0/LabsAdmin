
// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    dependencies {
//        classpath("com.google.gms:google-services:4.4.1")
//        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.7.7")
//        classpath("com.google.dagger:hilt-android-gradle-plugin:2.49")
//        classpath("com.android.tools.build:gradle:4.1.3")
    }
    repositories {
        google()
        mavenCentral()
    }
}
plugins {
    id("com.android.application") version "8.3.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.23" apply false
//    alias(libs.plugins.androidApplication) apply false
//    alias(libs.plugins.jetbrainsKotlinAndroid) apply false


//    id("com.google.gms.google-services") version "4.4.1" apply false
//    id("androidx.navigation.safeargs") version "2.5.1" apply false
//    id("com.google.devtools.ksp") version "1.9.23-1.0.20" apply false
//    id ("com.google.dagger.hilt.android") version "2.44" apply false
}