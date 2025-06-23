plugins {
    id("com.android.library")
    id("maven-publish")
}

android {
    namespace = "com.dorukkangal.vectormaster"
    compileSdk = 35

    defaultConfig {
        minSdk = 21
        targetSdk = 35
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

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
    }
}

dependencies {
    implementation("com.android.support:appcompat-v7:28.0.0")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    testImplementation("junit:junit:4.13.2")
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.github.dorukkangal"
            artifactId = "VectorMaster"
            version = "1.0.0"

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}
