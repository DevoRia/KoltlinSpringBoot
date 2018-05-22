package com.vadim.pack

import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface Repo : MongoRepository<Model, ObjectId>