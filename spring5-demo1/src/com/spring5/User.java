package com.spring5;

public class User {
    private int id;
    private String name;
    private String address;
    public void add() {
        System.out.printf("add...");
    }

    public User() {
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printUser(){
        System.out.printf(name+"***"+id+"***"+address);
    }
}
