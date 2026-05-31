pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net/") {
            name = "Fabric"
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = extra["modId"] as String

/// Common ///
include("common")

/// 1.19.4 ///
include("1.19.4-common")
include("1.19.4-forge")
include("1.19.4-fabric")

/// 1.20.1 ///
include("1.20.1-common")
include("1.20.1-forge")
include("1.20.1-fabric")

/// 1.21.11 ///
include("1.21.11-common")
include("1.21.11-fabric")

/// 26.1 ///
include("26.1-common")
include("26.1-fabric")
include("26.1-neo")
