package com.graphql.demo.data

import lombok.Data
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*


@Document()
@Data
data class User(
        @Id
        private val id : String = UUID.randomUUID().toString(),
        private val name : String
)