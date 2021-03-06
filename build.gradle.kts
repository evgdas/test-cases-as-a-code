plugins {
    id("java")
    id("maven")
    id("io.qameta.allure") version "2.6.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

allure {
    version = "2.13.6"

    autoconfigure = true
    aspectjweaver = true

    useJUnit5 {
        version = "2.13.6"
    }
}

tasks.withType(Test::class) {
    ignoreFailures = true
    useJUnitPlatform {}
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.3.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.3.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.3.0")
}
