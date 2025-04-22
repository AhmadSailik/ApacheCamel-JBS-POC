package com.example.apacheCamelPOC212.Producer.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddNameRequest")
public class AddNameRequest {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
