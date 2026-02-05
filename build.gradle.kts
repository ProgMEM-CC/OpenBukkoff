plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose)
    alias(libs.plugins.kotlin.compose)
}

group = "cc.progmem"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    google()
    maven {
        url = uri("https://jitpack.io")
        content { includeGroup("com.github.Dansoftowner") }
    }
}

dependencies {
    implementation(compose.desktop.currentOs) {
        exclude(group = "org.jetbrains.compose.material", module = "material")
        exclude(group = "org.jetbrains.compose.material", module = "material-desktop")
        exclude(group = "org.jetbrains.compose.material", module = "material-ripple")
    }
    implementation(compose.components.resources)
    implementation(compose.material3)
    implementation(compose.materialIconsExtended)
    // System theme detection
    implementation(libs.theme.detector) {
        exclude(group = "net.java.dev.jna", module = "jna")
        exclude(group = "net.java.dev.jna", module = "jna-platform")
    }
    implementation(libs.catppuccin)
}

kotlin {
    jvmToolchain(21)
}
