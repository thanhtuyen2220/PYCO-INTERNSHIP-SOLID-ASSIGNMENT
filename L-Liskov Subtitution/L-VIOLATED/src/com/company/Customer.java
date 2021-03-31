package com.company;

public class Customer extends User {
    public Customer(String name, String username, String position) {
        super(name, username,position);
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    public void listOfUser() throws Exception{}
    public void orderProducts() {
        System.out.println("I decided to buy this");
    }
    public void purchaseReport() throws Exception{};
    public void discountForEmployee() throws Exception{};
}
