package com.example.graphqlexample.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlexample.dto.StudentDto;
import com.example.graphqlexample.request.SampleRequest;
import com.example.graphqlexample.service.IStudentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private IStudentService studentService;

    @Autowired
    private ModelMapper modelMapper;

    public String firstQuery() {
        return "first query";
    }

    public String getFullName(SampleRequest sampleRequest) {
        return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
    }

    public StudentDto getStudentById(long id) throws Exception {
        return modelMapper.map(studentService.findById(id), StudentDto.class);
    }
}
