// Override build file for avf-stubs submodule
// This simplifies the original build.gradle.kts for integration with parent project
plugins {
    id("com.android.library")
}

android {
    namespace = "io.freund.adrian.android.virtualmachine.stubs"
    compileSdk = 34

    defaultConfig {
        minSdk = 31
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    compileOnly("androidx.annotation:annotation:1.7.1")
}
