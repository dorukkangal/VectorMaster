plugins {
    id("com.android.application")
}

android {
    namespace = "com.sdsmdg.harjot.vectormasterdemo"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sdsmdg.harjot.vectormasterdemo"
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
    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation(project(":vectormaster"))
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    testImplementation("junit:junit:4.13.2")
}
