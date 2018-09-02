package com.graphql.demo.dao

import com.graphql.demo.repository.UserRepository
import org.springframework.stereotype.Component

@Component
class UserDao(
        private val userRepository: UserRepository
){
    
}