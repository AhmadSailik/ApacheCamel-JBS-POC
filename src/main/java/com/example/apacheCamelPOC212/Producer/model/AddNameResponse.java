package com.example.apacheCamelPOC212.Producer.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AddNameResponse")
public class AddNameResponse {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
