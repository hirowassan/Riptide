# Riptide Everywhere

Allows you to use the Riptide enchantment on tridents in any weather condition — no water required.

## Supported Platforms

| Minecraft | Fabric | Legacy Forge | NeoForge |
|-----------|:------:|:------------:|:--------:|
| 1.19.4    |   ✅   |      ✅       |    -     |
| 1.20.1    |   ✅   |      ✅       |    -     |
| 1.21.11   |   ✅   |      ❌       |    -     |
| 26.1      |   ✅   |      ❌       |    ✅    |
| 26.3      |   ✅   |      ❌       |    ✅    |

## Compatibility

- [More Gears](https://github.com/CoolerProYT/MoreGears): its Enderite trident can use Riptide in any weather (26.1 and 26.3).

## Building

Build all platforms:

```sh
./gradlew build
```

Build a specific platform:

```sh
./gradlew :1.20.1-fabric:build
./gradlew :26.1-neo:build
```

## Running

```sh
./gradlew :1.19.4-fabric:runClient
./gradlew :1.19.4-forge:runClient
./gradlew :1.20.1-fabric:runClient
./gradlew :1.20.1-forge:runClient
./gradlew :1.21.11-fabric:runClient
./gradlew :26.1-fabric:runClient
./gradlew :26.1-neo:runClient
./gradlew :26.3-fabric:runClient
./gradlew :26.3-neo:runClient
```

## Requirements

- JDK 17+ to configure Gradle (Temurin 25 recommended)
- Java versions per Minecraft version are automatically downloaded via [Foojay Toolchain Resolver](https://github.com/gradle/foojay-toolchains)
