package com.vadim.pack

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PackApplication

fun main(args: Array<String>) {
    runApplication<PackApplication>(*args)
}
