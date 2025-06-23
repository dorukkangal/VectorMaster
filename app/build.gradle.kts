plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.dorukkangal.vectormasterdemo"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.dorukkangal.vectormasterdemo"
        minSdk = 21
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
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
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:2.1.21")
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation(project(":vectormaster"))
    androidTestImplementation("androidx.test:runner:1.6.2")
    testImplementation("junit:junit:4.13.2")
}
