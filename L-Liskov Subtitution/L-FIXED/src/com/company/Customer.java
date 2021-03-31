package com.company;

public class Customer extends User {

    public Customer(String name, String username, String position) {
        super(name, username, position);
    }
    @Override
    public void orderProducts() {
        System.out.println("I decided to buy this");
    }
}
