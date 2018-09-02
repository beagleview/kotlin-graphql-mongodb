package com.graphql.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinGraphqlMongodbApplication

fun main(args: Array<String>) {
    runApplication<KotlinGraphqlMongodbApplication>(*args)
}
