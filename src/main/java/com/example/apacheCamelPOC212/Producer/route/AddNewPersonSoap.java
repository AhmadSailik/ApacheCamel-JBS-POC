package com.example.apacheCamelPOC212.Producer.route;

import com.example.apacheCamelPOC212.Producer.service.HelloServicesImp;
import org.apache.camel.builder.RouteBuilder;

public class AddNewPersonSoap extends RouteBuilder {
    @Override
    public void configure() throws Exception {

//        from("direct:addNewName")
////                .to("")
//                .bean(HelloServicesImp.class,"addNewName");

    }
}
