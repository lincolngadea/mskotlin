package br.com.lincolngadea.ms_kotlin_learning.controller

import br.com.lincolngadea.ms_kotlin_learning.model.Person
import br.com.lincolngadea.ms_kotlin_learning.service.PersonService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/person")
class PersonController {
    @Autowired
    private lateinit var service: PersonService

    @GetMapping("/{id}")
    fun getPersonById(
        @PathVariable id: Long
    ): Person {
        return service.findById(id)
    }

    @GetMapping
    fun getAllPerson(): MutableList<Person>{
        return service.findAll()
    }

    @PostMapping
    fun createPerson(
        @RequestBody person: Person
    ): Person{
        return service.createPerson(person)
    }

    @PatchMapping("/{id}")
    fun updatePerson(
        @PathVariable id: Long,
        @RequestBody person: Person
    ): Person{
        return service.updatePerson(person, id)
    }

}