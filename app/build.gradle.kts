plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.domain.android.modulorization"
    compileSdk {
        version = release(version = 36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.domain.android.modulorization"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(name = "proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    // ==============================
    // INCLUDED
    // ==============================
    implementation(project(":change-information"))

    // ==============================
    // CORE KTX
    // ==============================
    implementation(libs.bundles.androidx.core.ktx)

    // ==============================
    // UNIT TEST
    // ==============================
    implementation(libs.bundles.unit.test)

    // ==============================
    // COMPOSE UI
    // ==============================
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.androidx.compose.ui.core)
    implementation(libs.bundles.compose.material)
    implementation(libs.androidx.constraintlayout)

    // =============================
    // OTHER-DEP
    // =============================
    implementation(libs.androidx.lifecycle.viewmodel.compose)
}