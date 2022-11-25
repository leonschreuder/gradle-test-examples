// This is like a normal build.gradle.kts file which defines and builds the plugin I guess.

// Some notes:
// - You can have multiple plugins simultaniously, adding one of these for each one.
// - Dependencies for the sourcecode should be added in buildSrc/build.gradle.kts

plugins {
    `java-library`
}

// If you want to apply the plugin as soon as it is applied in plugins {} you need to apply it here
apply<com.example.MyPlugin>()

