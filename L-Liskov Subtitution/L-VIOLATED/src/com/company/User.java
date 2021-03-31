package com.company;

public class User {
    protected int Id;
    protected String name;
    protected String username;
    protected String position;

    public User(String name, String username,String position) {
        this.name = name;
        this.username = username;
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void listOfUser() throws Exception{}
    public void orderProducts() {
        System.out.println("I decided to buy this");
    }
    public void purchaseReport() throws Exception{};
    public void discountForEmployee() throws Exception{};

 }
