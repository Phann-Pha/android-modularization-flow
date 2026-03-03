plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.domain.android.modulorization.feature.change_information"
    compileSdk {
        version = release(version = 36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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