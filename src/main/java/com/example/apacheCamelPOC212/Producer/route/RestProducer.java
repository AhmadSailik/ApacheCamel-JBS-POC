package com.example.apacheCamelPOC212.Producer.route;

import com.example.apacheCamelPOC212.Producer.model.HelloRequest;
import com.example.apacheCamelPOC212.Producer.model.HelloResponse;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;

@Component
public class RestProducer extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration()
                .component("netty-http")
                .contextPath("/api")
                .port(8081)
                .bindingMode(RestBindingMode.json);

        rest("/greeting")
                .skipBindingOnErrorCode(true)
                .clientRequestValidation(true)
                .description("testAPI")
                .get().produces("application/json")
                .param().name("name").type(RestParamType.query).dataType("string").required(true).endParam()
                .to("direct:greeting");

        from("direct:greeting")
                .log("hello")
                .process(ex->{
                    HelloResponse response = new HelloResponse();
                    response.setGreeting(ex.getIn().getHeader("name",String.class));
                    ex.getIn().setBody(response);
                });

        from("timer:foo?repeatCount=1")
                .setBody().constant("rrts0990")
                .process(exchange -> {
                    System.out.println(0000000000000000000);
                    System.out.println("restTest");
                });
    }
}
