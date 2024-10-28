plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.yoga3"  // Make sure this matches your package name
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.yoga3"  // Make sure this matches your package name
        minSdk = 28
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        dataBinding = true  // Using data binding
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Jetpack Compose dependencies
    implementation("androidx.compose.ui:ui:1.5.0") // or latest version
    implementation("androidx.compose.material:material:1.5.0") // or latest version
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0") // or latest version
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2") // for LiveData
    implementation("androidx.activity:activity-compose:1.6.1") // for Compose

    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // CameraX dependencies
    val camerax_version = "1.2.3"
    implementation("androidx.camera:camera-core:$camerax_version")
    implementation("androidx.camera:camera-camera2:$camerax_version")
    implementation("androidx.camera:camera-lifecycle:$camerax_version")

    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.20") // Replace with your Kotlin version

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
