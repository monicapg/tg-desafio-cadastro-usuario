plugins {
    id("com.android.application")
//    id ('org.jetbrains.kotlin.android') version ('1.8.0') apply false
    id("org.jetbrains.kotlin.android") version "2.0.0-Beta3"

}

android {
    viewBinding {
        enable = true
    }
    namespace = "com.example.desafio_thomas_greg"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.desafio_thomas_greg"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
//    implementation ("androidx.navigation:navigation-fragment:2.5.3")
//    implementation ("androidx.navigation:navigation-ui:2.5.3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}