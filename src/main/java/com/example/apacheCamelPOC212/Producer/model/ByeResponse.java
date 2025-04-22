package com.example.apacheCamelPOC212.Producer.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ByeResponse")
public class ByeResponse {
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
