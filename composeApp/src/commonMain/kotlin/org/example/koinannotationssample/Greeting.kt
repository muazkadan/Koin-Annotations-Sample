package org.example.koinannotationssample

import org.koin.core.annotation.Single

@Single
class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}