package io.github.comstering

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class MmsApplication

fun main(args: Array<String>) {
    runApplication<MmsApplication>(*args)
}
