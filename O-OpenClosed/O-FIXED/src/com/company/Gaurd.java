package com.company;

public class Gaurd extends Staff {
    public Gaurd(int id, String name, String position, String age) {
        super(id, name, position, age);
    }

   /* @Override
    public void introPosition(){
        System.out.println("Hello,I am a Gaurd");
    }*/

    @Override
    public String getPosition() {
        return super.getPosition();
    }

    @Override
    public void introPosition() {
        super.introPosition();
        System.out.println("Hello,I am a Gaurd");
    }
/*@Override
    public void introPostion() {
    }*/

}