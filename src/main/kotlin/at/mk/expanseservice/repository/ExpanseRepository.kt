package at.mk.expanseservice.repository

import at.mk.expanseservice.model.Expanse
import org.springframework.data.repository.CrudRepository


interface ExpanseRepository : CrudRepository<Expanse, Long> {
    fun findByName(expanseName : String) : List<Expanse> {
        return findByName(expanseName);
    }
}