package org.example.koinannotationssample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform