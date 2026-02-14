package com.julio.crud.controller;

import com.julio.crud.model.Person;
import com.julio.crud.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping ("")
    public List<Person> getAll() {return personService.getAll();}

    @PostMapping ("")
    public Person create(@RequestBody Person person) {return personService.create(person);}

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable UUID id) {personService.deleteById(id);}

    @PutMapping ("/{id}")
    public Person update  (@PathVariable UUID id, @RequestBody Person person) {return personService.updateById(id, person);}
}
