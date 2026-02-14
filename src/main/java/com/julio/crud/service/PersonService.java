package com.julio.crud.service;

import com.julio.crud.model.Person;
import com.julio.crud.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> getAll() {
        return personRepository.findAll();
    }
    public Person create(Person person) {
        return personRepository.save(person);
    }
    public void deleteById(UUID id) {
        personRepository.deleteById(id);
    }
    public Person updateById(UUID id, Person person) {
        Person existing = personRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Person not found"));

        existing.setName(person.getName());
        existing.setAge(person.getAge());

        return personRepository.save(existing);
    }


}
