plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt") // Use if you are using Kapt for annotation processing
}

android {
    compileSdk = 34 // Set to your desired compile SDK version

    defaultConfig {
        applicationId = "com.example.yogainstructorapp" // Change to your application ID
        minSdk = 21 // Set to your minimum SDK version
        targetSdk = 34 // Set to your target SDK version
        versionCode = 1
        versionName = "1.0"

        // If you're using Kotlin Kapt for Room or other annotation processing, add this:
        kapt {
            arguments {
                arg("room.schemaLocation", "$projectDir/schemas")
            }
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    // Optional: If you want to use Jetpack Compose
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0" // Set to your desired version
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.10.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.compose.ui:ui:1.4.0")
    implementation("androidx.compose.material:material:1.4.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.1")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1") // For ViewModel support
    implementation("androidx.room:room-runtime:2.5.1") // Room dependencies
    kapt("androidx.room:room-compiler:2.5.1") // Room Kapt dependency

    // Add other dependencies as needed, e.g., Retrofit for networking, etc.
}

