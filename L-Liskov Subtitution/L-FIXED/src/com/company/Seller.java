package com.company;

public class Seller extends User implements IEmployeeBenefit {
    public Seller(String name, String username, String position) {
        super(name, username, position);
    }
    @Override
    public void listOfUser(){
        System.out.println("Loading List of user in system");
    };
    @Override
    public void orderProducts() {
        System.out.println("I decided to buy this");
    }
    public void purchaseReport() {
        System.out.println("The list of total orders in system");
    };
    @Override
    public void discountForEmployee(){
        System.out.println(getPosition() + " received a coupon of discount 50%");
    };

}
