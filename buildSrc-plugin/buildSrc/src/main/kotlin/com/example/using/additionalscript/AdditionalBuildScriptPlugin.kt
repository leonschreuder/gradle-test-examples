package com.example.using.additionalscript

import org.gradle.api.Plugin
import org.gradle.api.Project

class AdditionalBuildScriptPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.logger.lifecycle("Plugin ${this.javaClass.simpleName} applied.")
    }
}