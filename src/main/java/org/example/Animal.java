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

    // Default constructor, defaults name to "Unknown" and isDog to false
    public Animal() {
        this("Unknown", false);
    }

    // Getter method to retrieve the name of the animal
    public String getName() {
        return name;
    }

    // Getter method to check if the animal is a dog
    public boolean isDog() {
        return isDog;
    }