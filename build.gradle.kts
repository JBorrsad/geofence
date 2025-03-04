// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
        classpath("com.google.gms:google-services:4.4.0")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.9.10")
        classpath("org.jetbrains.dokka:dokka-base:1.9.10")
    }
}

plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
    id("org.jetbrains.dokka") version "1.9.10" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}