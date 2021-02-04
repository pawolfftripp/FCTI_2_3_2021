package com.FCTI;

public class Main {

    public static void main(String[] args) {

        //String name, int age, String location, String type, String color
        Pet cat1 = new Pet("Odin", 7, "NC", "cat", "black");
        Pet cat2 = new Pet("Finley", 5, "NC", "cat", "orange");

//Getters
        System.out.println(cat1.getName());
        System.out.println(cat1.getAge());
        System.out.println(cat1.getLocation());
        System.out.println(cat1.getType());
        System.out.println(cat1.getColor());
        cat1.returnAll();
        System.out.println();
        System.out.println();

        System.out.println(cat2.getName());
        System.out.println(cat2.getAge());
        System.out.println(cat2.getLocation());
        System.out.println(cat2.getType());
        System.out.println(cat2.getColor());
        cat2.returnAll();
        System.out.println();
        System.out.println();
//Setters
        cat1.setName("Fauxdin");
        cat1.setAge(8);
        cat1.setLocation("SC");
        cat1.setType("Dog");
        cat1.setColor("Blue");

        cat2.setName("FauxFin");
        cat2.setAge(6);
        cat2.setLocation("SC");
        cat2.setType("Rabbit");
        cat2.setColor("White");

        cat1.returnAll();
        System.out.println();
        cat2.returnAll();
    }
}
