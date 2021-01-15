package com.springdatajpa.crud.service;

import com.springdatajpa.crud.domain.PersonModel;
import com.springdatajpa.crud.dto.PersonDto;
import com.springdatajpa.crud.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @Override
    public List<PersonModel> getPerson(){
        return this.personRepository.findAll();
    }

    @Override
    public PersonModel savePerson(PersonDto personDto){
    PersonModel personModel = new PersonModel();
    personModel.setFirstname(personDto.getFirstname());
    personModel.setLastname(personDto.getLastname());
    personModel.setAge(personDto.getAge());

    return this.personRepository.save(personModel);
    }
    @Override
    public PersonModel updatePerson(PersonDto personDto){
        PersonModel personModel = new PersonModel();
        personModel.setId(personDto.getId());
        personModel.setFirstname(personDto.getFirstname());
        personModel.setLastname(personDto.getLastname());
        personModel.setAge(personDto.getAge());

        return this.personRepository.save(personModel);
    }
    @Override
    public Integer deletePerson(Integer id){
        personRepository.deleteById(id);
        return id;
    }


}
