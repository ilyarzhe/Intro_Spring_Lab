package com.example.MondayLab.models;

public class Greeting {
    private String name;
    Greeting(){}

    public Greeting(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
