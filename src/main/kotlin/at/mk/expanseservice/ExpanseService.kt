package at.mk.expanseservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class ExpanseService

fun main(args: Array<String>) {
	runApplication<ExpanseService>(*args)
}
