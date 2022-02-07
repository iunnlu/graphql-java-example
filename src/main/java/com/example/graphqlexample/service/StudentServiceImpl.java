package com.example.graphqlexample.service;

import com.example.graphqlexample.entity.Student;
import com.example.graphqlexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student findById(Long id) throws Exception {
        return studentRepository.findById(id).orElseThrow(() -> new Exception("Student not found"));
    }
}
