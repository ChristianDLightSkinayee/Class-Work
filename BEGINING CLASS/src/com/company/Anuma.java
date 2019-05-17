package com.company;

/**
 * Created by CD3300 on 2/21/2019.
 */


public class Anuma {
    //properties
    String species;
    String name;
    String color;
    int age;

    public Anuma(String species, String name, String color) {
        age = 0;
        this.species = species;
        this.color = color;
        this.name = name;

    }
//these are my methodes

    public void MakeSound() {
        System.out.print("Grrrrrrrrr");
    }

    public void SetAge(int newAge) {
        age = newAge;


    }

    public void PrintDescription() {
        System.out.println(name + " is a " + age + " year old "+ color +" "+ species);


    }
}

