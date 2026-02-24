plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("plugin.serialization")
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
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:2.3.0")
    compileOnly("com.github.keiyoushi:extensions-lib:v1.4.2.1")
    compileOnly("com.squareup.okhttp3:okhttp:5.3.2")
    compileOnly("androidx.preference:preference-ktx:1.2.1")
    compileOnly("io.reactivex:rxjava:1.3.8")
    compileOnly("org.jsoup:jsoup:1.22.1")
    compileOnly("com.google.code.gson:gson:2.10.1")
}
