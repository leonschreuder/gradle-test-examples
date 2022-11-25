package com.example

import org.assertj.core.api.Assertions.assertThat
import org.gradle.testkit.runner.GradleRunner
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.io.TempDir
import java.io.File

class MyPluginMediumTest {
    @TempDir
    lateinit var testProjectDir: File

    @Test
    fun `basic ProjectBuilder setup`() {
        val buildFile = File(testProjectDir, "build.gradle.kts")

        buildFile.writeText(
            """
            plugins {
                id("plugin-id")
            }
            """.trimIndent()
        )

        val result = GradleRunner
            .create()
            .withProjectDir(testProjectDir)
            .withPluginClasspath()
            .withArguments("assemble")
            .build()

        assertThat(result.output).contains("Plugin class com.example.MyPlugin applied")
    }
}