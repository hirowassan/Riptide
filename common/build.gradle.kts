plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    // Match the oldest supported loader classpath: 1.19.4 resolves slf4j-api to 1.8.0-beta4.
    compileOnly("org.slf4j:slf4j-api:1.8.0-beta4")
}

java.toolchain {
    languageVersion = JavaLanguageVersion.of(17)
}
