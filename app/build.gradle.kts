plugins {
    id("com.android.application")
}

android {
    compileSdk = 34
    namespace = "com.lupawktu.possqlite"
    
    defaultConfig {
        applicationId = "com.lupawktu.poswithrealmdb"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.gridlayout:gridlayout:1.0.0")
    implementation("com.google.android.material:material:1.11.0")
    
    implementation("com.jakewharton:butterknife:8.6.0")
    annotationProcessor("com.jakewharton:butterknife-compiler:8.6.0")
    
    testImplementation("junit:junit:4.13.2")
    
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
