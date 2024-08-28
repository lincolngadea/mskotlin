package br.com.lincolngadea.ms_kotlin_learning.service

import br.com.lincolngadea.ms_kotlin_learning.model.Person
import org.springframework.stereotype.Service
import java.util.concurrent.atomic.AtomicLong
import java.util.logging.Logger

@Service
class PersonService {

    private val counter: AtomicLong = AtomicLong()
    private val logger = Logger.getLogger(PersonService::class.java.name)

    fun findById(id: Long): Person {
        logger.info("Action=PersonService, findById")

        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Lincoln"
        person.lastName = "Gadea"
        person.address = "Feira de Santana - Ba"
        person.gender = "male"
        return person
    }

    fun findAll(): MutableList<Person> {
        logger.info("Get All Persons")
        val persons: MutableList<Person> = ArrayList()
        for (i in 0..7) {
            val person = mockPerson(i)
            persons.add(person)
        }
        return persons
    }

    fun createPerson(person: Person) = person

    fun updatePerson(person: Person, id: Int): Person {
        person.id = counter.incrementAndGet()
        person.firstName = "Lincoln $id"
        person.lastName = "Gadea $id"
        person.address = "Some Address in Brasil"
        person.gender = "male"
        return person
    }

    fun deletePerson(id: Int) {}

    private fun mockPerson(i: Int): Person {
        val person = Person()
        person.id = counter.incrementAndGet()
        person.firstName = "Lincoln $i"
        person.lastName = "Gadea $i"
        person.address = "Some Address in Brasil"
        person.gender = "male"
        return person
    }
}