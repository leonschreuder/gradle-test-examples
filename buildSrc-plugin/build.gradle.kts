plugins {
    `java-library`
    `maven-publish`
    id("plugin-id")
}

repositories { mavenCentral() }

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

group = "io.github.leonschreuder"

version = "1.0.0"
