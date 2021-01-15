package com.springdatajpa.crud.controller;

import com.springdatajpa.crud.dto.PersonDto;
import com.springdatajpa.crud.service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
@CrossOrigin(origins= { "http://localhost:8081", }, maxAge=3000)
public class PersonApiController {

    private final PersonService personService;

    public PersonApiController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity <PersonDto> getPerson(){
        return new ResponseEntity(personService.getPerson(), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity <PersonDto> save(@RequestBody PersonDto personDto){
        return new ResponseEntity(personService.savePerson(personDto), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity <PersonDto> update(@RequestBody PersonDto personDto){
        return new ResponseEntity(personService.updatePerson(personDto),HttpStatus.OK);
    }
    /*http://localhost:8081/api/person?id=1*/
    @DeleteMapping
    public ResponseEntity <Integer> delete (@RequestParam ("id") Integer id){
        return new ResponseEntity(personService.deletePerson(id),HttpStatus.OK);
    }
}
