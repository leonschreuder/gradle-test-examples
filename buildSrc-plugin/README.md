
Example of a project that has an actual gradle plugin inside the buildSrc folder with tests.

Official documentation here:
https://docs.gradle.org/current/samples/sample_convention_plugins.html#organizing_build_logic

There are 2 possibilities as far as I could tell:
- defining a resource properties file
- placing a special buildscript file in src/main/kotlin whos name will define the plugin-id
