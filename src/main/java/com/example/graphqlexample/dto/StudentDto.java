package com.example.graphqlexample.dto;

import com.example.graphqlexample.entity.Address;
import com.example.graphqlexample.entity.Subject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
public class StudentDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
    @JsonIgnore
    private List<Subject> subjects;
}
