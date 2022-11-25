package com.example

import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test

class MyPluginTest {
    @Test
    fun `basic ProjectBuilder setup`() {
        val project = ProjectBuilder.builder().build()

        with(project.pluginManager ) {
            apply("plugin-id")
        }

    }
}