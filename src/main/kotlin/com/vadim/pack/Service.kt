package com.vadim.pack

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DataService( @Autowired val repo: Repo) {

    fun getInfo (): List<Model>{
       return repo.findAll()
    }

}