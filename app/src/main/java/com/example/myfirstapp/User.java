package com.example.myfirstapp;

public class User {
    String id;
    String username;
    String userNumber;
    String userAddress;
    private  User(){}
    User(String id, String username) {
        this.id = id;
        this.username = username;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

}