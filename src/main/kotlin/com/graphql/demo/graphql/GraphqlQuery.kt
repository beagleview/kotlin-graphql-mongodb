package com.graphql.demo.graphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.graphql.demo.dao.UserDao
import org.springframework.stereotype.Component

@Component
class GraphqlQuery(
        private val userDao: UserDao
) : GraphQLQueryResolver{

}