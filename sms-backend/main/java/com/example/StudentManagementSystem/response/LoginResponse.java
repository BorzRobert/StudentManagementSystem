package com.example.StudentManagementSystem.response;

public class LoginResponse {
    String message;
    Boolean response;

    public LoginResponse(String message, Boolean response) {
        this.message = message;
        this.response = response;
    }

    public LoginResponse() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getResponse() {
        return response;
    }

    public void setResponse(Boolean response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "message='" + message + '\'' +
                ", response=" + response +
                '}';
    }
}
