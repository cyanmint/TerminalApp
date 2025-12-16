plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.cyanmint.terminalapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.cyanmint.terminalapp"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "../proguard.flags"
            )
        }
        debug {
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

    sourceSets {
        getByName("main") {
            java.srcDirs("../java")
            aidl.srcDirs("../aidl")
            res.srcDirs("../res")
            assets.srcDirs("../assets")
            manifest.srcFile("../AndroidManifest.xml")
        }
    }
}

dependencies {
    // AndroidX Core
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    
    // Material Design
    implementation("com.google.android.material:material:1.11.0")
    
    // Navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.6")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.6")
    
    // Window management
    implementation("androidx.window:window:1.2.0")
    
    // WorkManager
    implementation("androidx.work:work-runtime-ktx:2.9.0")
    
    // Apache Commons Compress
    implementation("org.apache.commons:commons-compress:1.25.0")
    
    // Gson
    implementation("com.google.code.gson:gson:2.10.1")
    
    // ViewPager2
    implementation("androidx.viewpager2:viewpager2:1.0.0")
}
