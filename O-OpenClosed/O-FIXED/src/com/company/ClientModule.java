package com.company;

public class ClientModule {
    public static void main(String[] args) {
        Intro intro = new Intro();
        Staff Employee1 = new Seller(1,"Blob","Seller","27");
        intro.Intro(Employee1);
        Staff Employee2 = new Gaurd(2,"Bob","Gaurd","27");
        intro.Intro(Employee2);
        Staff Employee3 = new Manager(5,"Steven","Manager","27");
        intro.Intro(Employee3);

    }
}