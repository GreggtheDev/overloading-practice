package org.example;

import java.util.ArrayList; // Importing ArrayList to store Animal objects
import java.util.Scanner; // Importing Scanner to read user input

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        ArrayList<Animal> animals = new ArrayList<>(); // Creating an ArrayList to store Animal objects

        // Adding objects using different constructors
        animals.add(new Animal("Buddy", true)); // Using constructor with both parameters
        animals.add(new Animal("Whiskers")); // Using constructor with only name
        animals.add(new Animal()); // Using default constructor