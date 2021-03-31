package com.company;

public class Seller extends Staff {
    public Seller(int id, String name, String position, String age) {
        super(id, name, position, age);
    }

    /*@Override
    public void introPostion() {
    }*/

    @Override
    public void introPosition() {
        super.introPosition();
        System.out.println("Hello,I am a Seller");
    }
}