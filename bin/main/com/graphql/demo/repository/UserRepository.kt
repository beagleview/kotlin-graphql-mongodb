package com.graphql.demo.repository

import com.graphql.demo.data.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User,String>{}