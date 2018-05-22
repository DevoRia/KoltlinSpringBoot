package com.vadim.pack

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.io.Serializable

@Document(collection = "some")
class Model(
        @Id
        var id: ObjectId,
        var text: String
)