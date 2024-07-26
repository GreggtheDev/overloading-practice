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

        // Loop to read user input
        while (true) {
            System.out.print("Enter animal name: ");
            String name = scanner.nextLine(); // Reading the animal name from user input
            if (name.isEmpty()) {
                break; // If the input is empty, break the loop
            }
            System.out.print("Is it a dog? (true/false): ");
            boolean isDog = Boolean.parseBoolean(scanner.nextLine()); // Reading if the animal is a dog from user input
            animals.add(new Animal(name, isDog)); // Adding a new Animal object to the list
        }

        // Printing the animals entered
        System.out.println("Animals entered:");
        for (Animal animal : animals) {
            System.out.println(animal); // Printing each Animal object using the overridden toString() method
        }
    }
}