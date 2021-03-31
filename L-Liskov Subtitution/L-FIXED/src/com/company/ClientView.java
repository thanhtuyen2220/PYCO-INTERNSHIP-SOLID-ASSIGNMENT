package com.company;

public class ClientView {

    public static void main(String[] args) {
        User seller = new Seller("Tuyen","tuyenthanh","seller");
        User Customer = new Customer("Thao","thaothanh","customer");


        seller.orderProducts();
        Customer.orderProducts();
    }
}
