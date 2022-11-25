plugins {
    `kotlin-dsl`
}

repositories { mavenCentral() }

dependencies {
    val jupiterVersion = "5.7.0"
    testImplementation("org.junit.jupiter:junit-jupiter-api:$jupiterVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jupiterVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$jupiterVersion")
    testImplementation("org.assertj:assertj-core:3.22.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
