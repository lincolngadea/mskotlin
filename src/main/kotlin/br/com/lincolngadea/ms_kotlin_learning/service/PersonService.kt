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
}