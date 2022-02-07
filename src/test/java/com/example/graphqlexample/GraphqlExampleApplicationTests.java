package com.example.graphqlexample;

import com.example.graphqlexample.entity.Student;
import com.example.graphqlexample.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Optional;

@SpringBootTest
class GraphqlExampleApplicationTests {
    @Autowired
    StudentRepository studentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void getStudentById() {
        Optional<Student> studentOptional = studentRepository.findById(1L);
        System.out.println(studentOptional.get().getFirstName());
    }
}
