package com.example.using.additionalscript

import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test

class AdditionalBuildScriptPluginTest {
    @Test
    fun `basic ProjectBuilder setup`() {
        val project = ProjectBuilder.builder().build()

        with(project.pluginManager ) {
            apply("additional-build-script-id")
        }

    }
}