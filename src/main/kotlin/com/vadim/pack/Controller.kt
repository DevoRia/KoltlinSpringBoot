package com.vadim.pack

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/server")
class MainController( @Autowired val dataService: DataService) {

    fun getInfo(): List<Model> {
        return dataService.getInfo()
    }

}