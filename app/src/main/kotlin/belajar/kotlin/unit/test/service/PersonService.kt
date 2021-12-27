package belajar.kotlin.unit.test.service

import belajar.kotlin.unit.test.model.Person
import belajar.kotlin.unit.test.repository.PersonRepository
import java.lang.IllegalArgumentException

class PersonService(private val personRepository: PersonRepository) {

    fun get(id: String) : Person {
        if (id.isBlank()) {
            throw IllegalArgumentException("Person id is not valid")
        }

        // logic
        val person = personRepository.selectById(id)
        if (person != null) {
            return person
        } else {
            throw Exception("Person not found")
        }
    }

}