plugins {
    alias(libs.plugins.kotlinJvm)
    `maven-publish`
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation(projects.codegenModels)
    implementation(libs.logback)
    implementation(libs.kotlinpoet)
    implementation(libs.kotlinpoet.metadata)
    implementation(libs.kotlinpoet.metadata.specs)
    implementation(libs.kotlinpoet.ksp)
    implementation(libs.kotlinx.serialization.json)
}

application {
    mainClass.set("io.availe.ApplicationKt")
}