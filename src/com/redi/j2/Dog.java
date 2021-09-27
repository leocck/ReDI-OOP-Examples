package com.redi.j2;

public class Dog {

    // properties

    private String name;
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
}
