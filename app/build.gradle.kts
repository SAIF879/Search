plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
  //  alias(libs.plugins.kotlin.serialization)
    // Kotlin Serialization Plugin - required for @Serializable annotations
    id("org.jetbrains.kotlin.plugin.serialization")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.search"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.search"
        minSdk = 28
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.compose.ui.test.junit4)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)
    //implementation(libs.kotlinx.serialization.json)

    // Retrofit - Network HTTP client for API calls
    implementation("com.squareup.retrofit2:retrofit:2.11.0")

    // Koin - Dependency Injection framework for Android
    implementation("io.insert-koin:koin-android:3.5.6")
    // Koin Compose - Koin integration for Jetpack Compose
    implementation("io.insert-koin:koin-androidx-compose:3.5.6")

//    // Kotlinx Serialization JSON - JSON serialization/deserialization (for data classes)
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
    // Retrofit Gson Converter - Simple JSON parsing with Retrofit (easier for mock apps)
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    // Navigation Compose - Type-safe navigation for Jetpack Compose
    implementation("androidx.navigation:navigation-compose:2.7.7")

    // Coil - Image loading library for Compose
    implementation("io.coil-kt:coil-compose:2.5.0")

    // Material Icons Extended
    implementation("androidx.compose.material:material-icons-extended:1.6.0")

    // Room
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")

    // Room compiler (KSP)
    ksp("androidx.room:room-compiler:2.6.1")

    // Paging runtime (for Flow / LiveData)
    implementation("androidx.paging:paging-runtime:3.2.0")

    // Paging Compose integration
    implementation("androidx.paging:paging-compose:3.2.0")

    // Optional: Paging + Room
    implementation("androidx.room:room-paging:2.6.1")

}