package com.julio.crud.controller;

import com.julio.crud.model.Person;
import com.julio.crud.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping ("/read")
    public List<Person> getAll() {return personService.getAll();}

    @PostMapping ("/create")
    public Person create(@RequestBody Person person) {return personService.create(person);}

    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable Long id) {personService.deleteById(id);}

    @PutMapping ("/update/{id}")
    public Person update  (@PathVariable Long id, @RequestBody Person person) {return personService.updateById(id, person);}
}
