package com.springdatajpa.crud.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class PersonDto {

    private Integer id;
    @NotBlank(message = "Bawal empty tong firstname")
    private String firstname;
    @NotBlank(message = "Bawal empty to lastname")
    private String lastname;
    @NotNull(message = "Bawal null si age")
    private Integer age;
    public String getFirstname() {
        return firstname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
