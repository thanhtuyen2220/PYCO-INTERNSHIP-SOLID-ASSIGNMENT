package com.company;

 class Staff {
     private int id;
     private String name;
     private String position;
     private String Age;

     public Staff(int id, String name, String position, String age) {
         this.id = id;
         this.name = name;
         this.position = position;
         Age = age;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getPosition() {
         return position;
     }

     public void setPosition(String position) {
         this.position = position;
     }

     public String getAge() {
         return Age;
     }

     public void setAge(String age) {
         Age = age;
     }
 }
