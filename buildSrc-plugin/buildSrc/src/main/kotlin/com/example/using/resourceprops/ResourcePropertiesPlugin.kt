package com.example.using.resourceprops

import org.gradle.api.Plugin
import org.gradle.api.Project

class ResourcePropertiesPlugin  : Plugin<Project> {
    override fun apply(project: Project) {
        project.logger.lifecycle("Plugin ${this.javaClass.simpleName} applied.")
    }
}