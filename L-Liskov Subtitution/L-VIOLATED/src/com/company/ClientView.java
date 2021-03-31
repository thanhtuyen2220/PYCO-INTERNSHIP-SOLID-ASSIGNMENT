package com.company;

public class ClientView {

    public static void main(String[] args) throws Exception {
        User seller = new Seller("Tuyen","tuyenthanh","seller");
        User Customer = new Customer("Thao","thaothanh","customer");


        seller.orderProducts();
        seller.discountForEmployee();

        Customer.orderProducts();
        Customer.discountForEmployee();

    }
}
