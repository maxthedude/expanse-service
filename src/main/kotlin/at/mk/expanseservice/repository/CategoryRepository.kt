package at.mk.expanseservice.repository

import at.mk.expanseservice.model.Category
import org.springframework.data.repository.CrudRepository

interface CategoryRepository : CrudRepository<Category, Long> {
}