plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("androidx.navigation.safeargs.kotlin")
//    id("com.google.gms.google-services")
//    id("com.google.devtools.ksp")
//    id("com.google.dagger.hilt.android")
//    id("kotlin-kapt")
//    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.bloodlabs.admin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bloodlabs.admin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8

    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.12"
    }
}

dependencies {

//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.appcompat)
//    implementation(libs.material)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)


    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.compose.material3:material3-android:1.2.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.7")
//    implementation("androidx.navigation:navigation-compose:2.7.7")
//    implementation("androidx.navigation:navigation-ui-ktx:2.7.7")
//    implementation("com.google.firebase:firebase-auth:22.3.1")
//    implementation("androidx.legacy:legacy-support-v4:1.0.0")
//    implementation("androidx.recyclerview:recyclerview:1.3.2")
//    implementation("androidx.test:core-ktx:1.5.0")



    //navigation compose
    implementation("androidx.navigation:navigation-compose:2.7.7")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.7.0")
    implementation("androidx.compose.ui:ui-tooling:1.6.5")
    implementation("androidx.compose.ui:ui:1.6.5")

    //extended matarial icons
//    implementation("androidx.compose.material3:material3-icons-extended:1.2.1")



}