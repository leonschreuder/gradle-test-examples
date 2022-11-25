package com.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.logger.lifecycle("Plugin ${this.javaClass} applied.")
    }
}