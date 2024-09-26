# Koin Annotations Sample

This project is a simple example to demonstrate how to
use [Koin Annotations](https://github.com/InsertKoinIO/koin-annotations) in a Kotlin/Compose
Multiplatform application.

| Project               |                                                                                        Version                                                                                         |
|-----------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| Kotlin                |                                 [![Maven Central](https://img.shields.io/badge/Kotlin-2.0.20-blue.svg?style=flat&logo=kotlin)](https://kotlinlang.org)                                 |
| Compose Multiplatform | [![Maven Central](https://img.shields.io/maven-central/v/org.jetbrains.compose/compose-gradle-plugin)](https://mvnrepository.com/artifact/org.jetbrains.compose/compose-gradle-plugin) |
| Koin                  |                    [![Maven Central](https://img.shields.io/maven-central/v/io.insert-koin/koin-core)](https://mvnrepository.com/artifact/io.insert-koin/koin-bom)                     |
| koin-annotations      |             [![Maven Central](https://img.shields.io/maven-central/v/io.insert-koin/koin-annotations)](https://mvnrepository.com/artifact/io.insert-koin/koin-annotations)             |

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
    - `commonMain` is for code that’s common for all targets.
    - Other folders are for Kotlin code that will be compiled for only the platform indicated in the
      folder name.
      For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
      `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform,
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for
  your project.

Learn more
about 
- [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)
- [Compose Multiplatform](https://github.com/JetBrains/compose-multiplatform/#compose-multiplatform)
- [Kotlin/Wasm](https://kotl.in/wasm/)…
- [Kotlin with Koin](https://insert-koin.io/docs/quickstart/kotlin)
- [Kotlin with Koin Annotations](https://insert-koin.io/docs/quickstart/kotlin-annotations)
- [Android with Koin](https://insert-koin.io/docs/quickstart/android-viewmodel)
- [Android with Koin Annotations](https://insert-koin.io/docs/quickstart/android-annotations)
- [Android Jetpack Compose with Koin](https://insert-koin.io/docs/quickstart/android-compose)
- [Kotlin Multiplatform with Koin](https://insert-koin.io/docs/quickstart/kmp)
- [Ktor with Koin](https://insert-koin.io/docs/quickstart/ktor)
 
We would appreciate your feedback on Compose/Web and Kotlin/Wasm in the public Slack
channel [#compose-web](https://slack-chats.kotlinlang.org/c/compose-web).
If you face any issues, please report them
on [GitHub](https://github.com/JetBrains/compose-multiplatform/issues).

You can open the web application by running the `:composeApp:wasmJsBrowserDevelopmentRun` Gradle
task.