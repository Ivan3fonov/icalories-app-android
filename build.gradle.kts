// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (AndroidGradlePlugins.application) version AndroidGradlePlugins.gradleVersion apply false
    id (AndroidGradlePlugins.library) version AndroidGradlePlugins.gradleVersion apply false
    id (AndroidGradlePlugins.kotlin) version Kotlin.version apply false
}

tasks.register("clean", Delete::class) {
    delete (rootProject.buildDir)
}