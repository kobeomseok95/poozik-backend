package com.backend.poozik

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PoozikApplication

fun main(args: Array<String>) {
    runApplication<PoozikApplication>(*args)
}
