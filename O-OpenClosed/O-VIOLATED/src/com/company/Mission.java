package com.company;

public class Mission  {
    //Print out the introduction of Staff Position
    //If you want to add more position in this case,then you must add more if and it wold be messy.
    //Moreover,when we modified this class,it is opened too much.It shared almost of position in this class
    //It violated OCP because when we want to add more introPosition,we must modify old class

    public void introPosition(Staff employee){

        if(employee.getPosition() == "Seller" ){
            System.out.println("I am a seller");
        }
        if(employee.getPosition()== "Gaurd"){
            System.out.println("I am a Gaurd");
        }
        if(employee.getPosition()=="Manager"){
            System.out.println("I am a Manager");
        }
    }
}
