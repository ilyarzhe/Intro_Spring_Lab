package com.example.MondayLab.models;

public class CelebrationDTO {
    private String message;

    public CelebrationDTO(String message) {
        this.message = message;
    }
    public CelebrationDTO(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
