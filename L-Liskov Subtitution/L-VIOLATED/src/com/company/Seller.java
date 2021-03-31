package com.company;

public class Seller extends User {

    public Seller(String name, String username, String position) {
        super(name, username, position);
    }
    public String getPosition() {
        return super.getPosition();
    }
    public void listOfUser(){
        System.out.println("Loading List of user in system");
    }
    public void orderProducts(){
        System.out.println("I chose this products");
    }
    public void purchaseReport(){
        System.out.println("The list of total orders in system");
    }
    public void discountForEmployee(){
        System.out.println(getPosition() + " received a coupon of discount 50%");
    };
}
