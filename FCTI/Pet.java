package com.FCTI;

import java.io.PrintStream;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;
    private String color;

    public Pet() {}

    public Pet(String name, int age, String location, String type, String color) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public PrintStream returnAll() {
        return System.out.printf("%s, %s, %s, %s, %s", this.name, this.age, this.location, this.type, this.color);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
