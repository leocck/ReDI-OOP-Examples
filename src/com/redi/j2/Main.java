package com.redi.j2;

public class Main {

    public static void main(String[] args) {

        Dog peter = new Dog("Peter", "Dobermann", "Black");
        peter.bark();
        System.out.println(peter.getBreed());

        Dog shin = new Dog("Shin", "Shih Tzu", "White", false);
        shin.bark();
    }
}
