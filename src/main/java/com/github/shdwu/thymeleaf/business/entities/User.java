package com.github.shdwu.thymeleaf.business.entities;

import lombok.Data;

@Data
public class User {
    private String firstName = null;
    private String lastName = null;
    private String nationality = null;
    private Integer age = null;

    public User(final String firstName, final String lastName, 
            final String nationality, final Integer age) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.age = age;
    }
}