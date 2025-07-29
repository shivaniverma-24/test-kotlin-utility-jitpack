plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm) // This is using a version catalog
}

group = "com.github.shivaniverma-24" // ✅ Required for JitPack
version = "1.0.0"                     // ✅ Tag must match this

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}
