package org.example;

// Class representing an Animal
public class Animal {
    private String name; // Attribute to store the name of the animal
    private boolean isDog; // Attribute to store if the animal is a dog or not

    // Constructor with both parameters
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Constructor with only name, defaults isDog to false
    public Animal(String name) {
        this(name, false);
    }