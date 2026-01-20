pluginManagement {
    repositories {
        maven {
            url = uri("https://BTW-Community.github.io/BTW-gradle")
        }
        maven {
            name = "Fabric"
            url = uri("https://maven.fabricmc.net/")
        }
        maven {
            name = "Jitpack"
            url = uri("https://jitpack.io")
        }
        maven {
            name = "Kotori316"
            url = uri("https://maven.kotori316.com/")
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

gradle.rootProject {
    group = group
    version = version
    description = description
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version ("1.0.0")
}
