package com.example.using.resourceprops

import org.assertj.core.api.Assertions.assertThat
import org.gradle.testkit.runner.GradleRunner
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.io.File

class ResourcePropertiesPluginMediumTest {
    @TempDir
    lateinit var testProjectDir: File

    @Test
    fun `basic ProjectBuilder setup`() {
        val buildFile = File(testProjectDir, "build.gradle.kts")

        buildFile.writeText(
            """
            plugins {
                `java-library`
                id("resource-properties-id")
            }
            """.trimIndent()
        )

        val result = GradleRunner
            .create()
            .withProjectDir(testProjectDir)
            .withPluginClasspath()
            .withArguments("assemble")
            .build()

        assertThat(result.output).contains("Plugin ${ResourcePropertiesPlugin::class.java.simpleName} applied")
    }
}