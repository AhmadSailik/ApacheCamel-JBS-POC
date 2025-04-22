package com.example.apacheCamelPOC212.Producer.service;

import com.example.apacheCamelPOC212.Producer.model.*;

public class HelloServicesImp implements HelloService{
    @Override
    public HelloResponse sayHello(HelloRequest request) {
        HelloResponse response = new HelloResponse();
        response.setGreeting("Hello, " + request.getName() + "!");
        return response;
    }

    @Override
    public ByeResponse sayBye(ByeRequest request) {
        ByeResponse response = new ByeResponse();
        response.setGreeting("Goodbye, " + request.getName() + "!");
        return response;
    }

    @Override
    public AddNameResponse addNewName(AddNameRequest request) {
        AddNameResponse response = new AddNameResponse();
        response.setName("Hello: " + request.getName() + " ! The new request has been added successfully");
        return response;
    }
}
