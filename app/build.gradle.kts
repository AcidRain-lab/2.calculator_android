plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.example.calculator_android"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.calculator_android"
        minSdk = 26 // Set minSdk to 26 or another appropriate level, as 34 is too high for minSdk.
        //noinspection EditedTargetSdkVersion
        targetSdk = 35
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
    implementation(libs.androidx.core.ktx.v1150) // Updated from 1.9.0
    implementation(libs.androidx.lifecycle.runtime.ktx.v287) // Updated from 2.5.1
    implementation(libs.androidx.activity.compose.v193) // Updated from 1.6.1
    implementation(libs.ui) // Updated from 1.3.0
    implementation(libs.androidx.material) // Updated from 1.3.0
    implementation(libs.ui.tooling.preview) // Updated from 1.3.0
    implementation(libs.material3) // Updated from 1.0.0
    implementation(libs.exp4j)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v121)
    androidTestImplementation(libs.androidx.espresso.core.v361)
    androidTestImplementation(libs.ui.test.junit4) // Updated from 1.3.0
    debugImplementation(libs.ui.tooling) // Updated from 1.3.0
    debugImplementation(libs.ui.test.manifest) // Updated from 1.3.0
}
