// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
}

buildscript {
    repositories {
        google()
    }

    dependencies {
        val nav_version = "2.7.7"
        classpath("androidx.navigation.safeargs.kotlin:androidx.navigation.safeargs.kotlin.gradle.plugin:$nav_version")
    }
}