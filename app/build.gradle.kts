plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "eu.kanade.tachiyomi.extension.zh.jinmantiantangapi"
    compileSdk = 34
    
    defaultConfig {
        applicationId = "eu.kanade.tachiyomi.extension.zh.jinmantiantangapi"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0.0"
    }
    
    buildTypes {
        release {
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

dependencies {
    // Tachiyomi dependencies
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    compileOnly("com.github.keiyoushi:extensions-lib:v1.4.2.1")
    compileOnly("com.squareup.okhttp3:okhttp:4.12.0")
    compileOnly("androidx.preference:preference-ktx:1.2.1")
    compileOnly("com.github.tachiyomiorg:extensions-lib:1.5")
    compileOnly("com.squareup.okhttp3:okhttp:4.12.0")
    compileOnly("androidx.preference:preference-ktx:1.2.1")
}
