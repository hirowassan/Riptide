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

## Publishing

The **Publish** GitHub Actions workflow builds selected subprojects and uploads them to Modrinth and CurseForge. It only runs when started manually from **Actions → Publish → Run workflow**; pushes do not publish anything.

It requires these repository secrets:

- `MODRINTH_TOKEN` — Modrinth personal access token with the `create_version` scope
- `CURSEFORGE_TOKEN` — CurseForge API token

By default it publishes the 26.1 and 26.3 Fabric/NeoForge builds. The version comes from `modVersion` in `gradle.properties` unless overridden in the workflow, and the release notes are read from that version's section in `CHANGELOG.md`. Project IDs are configured in `.github/workflows/publish.yml`.

## Requirements

- [mise](https://mise.jdx.dev/) (recommended) or JDK 17+ to run Gradle (Temurin 25 recommended)
- Java versions per Minecraft version are automatically downloaded via [Foojay Toolchain Resolver](https://github.com/gradle/foojay-toolchains)

The repository includes a `mise.toml` that pins Java 25 and Gradle 9.4.0:

```sh
mise install   # installs the pinned tools
./gradlew build
```
