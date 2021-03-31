package com.company;

public class Main {

    public static void main(String[] args) {
        Mission staffMission =new Mission();
        Staff Employee1 = new Staff(1,"Jenny","Gaurd","27");
        staffMission.introPosition(Employee1);
        Staff Employee2 = new Staff(2,"Blob","Seller","27");
        staffMission.introPosition(Employee2);
        Staff Employee3 = new Staff(3,"Anne","Manager","27");
        staffMission.introPosition(Employee3);
    }
}
