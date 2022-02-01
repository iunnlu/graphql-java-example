package com.example.graphqlexample.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphqlexample.request.SampleRequest;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    public String firstQuery() {
        return "first query";
    }

    public String getFullName(SampleRequest sampleRequest) {
        return sampleRequest.getFirstName() + " " + sampleRequest.getLastName();
    }
}
