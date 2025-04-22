package com.example.apacheCamelPOC212.Producer.route;

import com.example.apacheCamelPOC212.Producer.service.HelloServicesImp;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRouteSoap extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        from("cxf:/hello?serviceClass=com.example.apacheCamelPOC212.Producer.service.HelloService")
                .routeId("hello-soap-route")
                .process(ex -> {
                    System.out.println("55555555555555");
                })
                .choice()
                    .when(simple("${header.operationName} == 'sayHello'"))
                        .bean(HelloServicesImp.class,"sayHello")
                    .when(simple("${header.operationName} == 'sayBye'"))
                        .bean(HelloServicesImp.class,"sayBye")
//                    .when(simple("${header.operationName} == 'addNewName'"))
//                        .to("direct:addNewName")

                .endChoice()
                .log("${body}");

                from("timer:foo?repeatCount=1")
                .setBody().constant("rrts0990")
                .process(exchange -> {
                    System.out.println(0000000000000000000);
                    System.out.println("ewewwwwwwwwwww");
                });
    }
}
