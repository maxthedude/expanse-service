package at.mk.expanseservice.controllers

import at.mk.expanseservice.model.Category
import at.mk.expanseservice.model.Expanse
import at.mk.expanseservice.repository.CategoryRepository
import at.mk.expanseservice.repository.ExpanseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("api/v1/expanse")
class ExpanseController  {

    @Autowired
    lateinit var repository: ExpanseRepository

    @Autowired
    lateinit var categoryRepository: CategoryRepository;

    @PostMapping("/save")
    fun addExpanse(@RequestBody expanse : Expanse) {
        repository.save(expanse);
    }

    @RequestMapping("/setUp")
    fun process() {
        var standard : Category = Category("Accomodation","House");
        categoryRepository.save(standard);
        repository.save(Expanse(name = "Hotel", sum = 250.0, category = standard))
        repository.save(Expanse(name = "Rental Car", sum = 650.0, category = standard))
        println( "Done")
    }

    @GetMapping("/")
    fun getExpanses() : MutableIterable<Expanse> {
        return repository.findAll();
    }

    @GetMapping("/get/{expanseName}")
    fun getExpanseByName(@PathVariable expanseName : String) : List<Expanse> {
        return repository.findByName(expanseName);
    }

}