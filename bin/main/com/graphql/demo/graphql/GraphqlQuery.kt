package com.graphql.demo.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.graphql.demo.dao.UserDao
import org.springframework.stereotype.Component

@Component
class GraphqlQuery(
        private val userDao: UserDao
) : GraphQLQueryResolver{
    fun version() = "1.0.1"
    fun getAllUser() = userDao.getAllUser()
    fun getUserByID(id : String) = userDao.getUserByID(id)
}