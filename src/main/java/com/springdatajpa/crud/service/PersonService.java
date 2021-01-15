package com.springdatajpa.crud.service;

import com.springdatajpa.crud.domain.PersonModel;
import com.springdatajpa.crud.dto.PersonDto;

import java.util.List;

public interface PersonService {
    List<PersonModel> getPerson();
    PersonModel savePerson(PersonDto personDto);
    PersonModel updatePerson(PersonDto personDto);
    Integer deletePerson(Integer id);
}
