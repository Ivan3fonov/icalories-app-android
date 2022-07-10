plugins {
    id(AndroidGradlePlugins.application)
    id(AndroidGradlePlugins.kotlin)
}

android {
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.appId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(Modules.core))
    implementation(project(Modules.onboarding))

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.lifecycleRuntimeKtx)

    implementation(Compose.ui)
    implementation(Compose.material3)
    implementation(Compose.uiToolingPreview)
    implementation(Compose.activity)
    implementation(Compose.animation)
    implementation(Compose.viewModel)
    debugImplementation(Compose.uiTooling)

    testImplementation(Testing.junit4)
    testImplementation(Testing.junitAndroidExt)
    testImplementation(Testing.composeUiTest)
    androidTestImplementation(Testing.junit4)
    androidTestImplementation(Testing.espresso)
    androidTestImplementation(Testing.composeUiTest)
    debugImplementation(Testing.composeUiTestManifest)

}