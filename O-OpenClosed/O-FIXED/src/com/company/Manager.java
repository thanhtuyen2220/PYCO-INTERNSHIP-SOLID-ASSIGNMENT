package com.company;

public class Manager extends Staff {
    public Manager(int id, String name, String position, String age) {
        super(id, name, position, age);
    }

    /*@Override
    public void introPostion() {
    }*/

    @Override
    public void introPosition() {
        super.introPosition();
        System.out.println("Hello,I am a Manager");

    }
}