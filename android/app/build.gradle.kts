plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.sujithchalla.royalfeast"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sujithchalla.royalfeast"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            // Signed release: without a signingConfig, assembleRelease produces
            // an UNSIGNED apk that Android refuses to install. The debug config
            // signs it so it installs cleanly for test/sideload use — the same
            // setup as the Smart Attendance wrapper. NOT for Play Store; switch
            // to a real release keystore before any store distribution.
            signingConfig = signingConfigs.getByName("debug")
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}
