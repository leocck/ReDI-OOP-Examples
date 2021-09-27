package com.redi.j2;

public class Dog {

    // properties

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    private String color;
    private String breed;
    private boolean hungry;

    // constructor

    public Dog(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.hungry = true;
    }

    public Dog(String name, String breed, String color, boolean hungry) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.hungry = hungry;
    }

    // behaviours (methods)

    public void bark() {
        System.out.println( this.name + " barking: Woof");
    }

    // getter methods

    public String getBreed() {
        return this.breed;
    }
}
