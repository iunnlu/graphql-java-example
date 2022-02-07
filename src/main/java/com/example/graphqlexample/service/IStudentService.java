package com.example.graphqlexample.service;

import com.example.graphqlexample.entity.Student;

public interface IStudentService {
    Student findById(Long id) throws Exception;
}
