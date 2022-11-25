package com.example.using.resourceprops

import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test

class ResourcePropertiesPluginTest {
    @Test
    fun `basic ProjectBuilder setup`() {
        val project = ProjectBuilder.builder().build()

        with(project.pluginManager ) {
            apply("resource-properties-id")
        }

    }
}