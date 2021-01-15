package com.springdatajpa.crud.repository;

import com.springdatajpa.crud.domain.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Integer> {
}
