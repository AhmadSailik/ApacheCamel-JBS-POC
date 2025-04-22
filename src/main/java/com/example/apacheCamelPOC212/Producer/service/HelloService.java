package com.example.apacheCamelPOC212.Producer.service;

import com.example.apacheCamelPOC212.Producer.model.*;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface HelloService {

    @WebMethod
    HelloResponse sayHello(HelloRequest request);

    @WebMethod
    ByeResponse sayBye(ByeRequest request);

    @WebMethod
    AddNameResponse addNewName(AddNameRequest request);
}
