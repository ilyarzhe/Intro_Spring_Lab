package com.example.MondayLab.models;

import java.time.LocalDate;

public class Celebration {

    private String christmasMessage;

    public Celebration(String christmasMessage) {
        this.christmasMessage = christmasMessage;
    }
    public Celebration(){}

    public String getChristmasMessage() {
        return christmasMessage;
    }

    public void setChristmasMessage(String christmasMessage) {
        this.christmasMessage = christmasMessage;
    }
}
