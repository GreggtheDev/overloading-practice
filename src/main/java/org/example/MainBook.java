package org.example;

import java.util.ArrayList; // Importing ArrayList to store Book objects
import java.util.Scanner; // Importing Scanner to read user input

public class MainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        ArrayList<Book> books = new ArrayList<>(); // Creating an ArrayList to store Book objects

        // Adding objects using different constructors
        books.add(new Book("To Kill a Mockingbird", 281, 1960)); // Using constructor with all parameters
        books.add(new Book("1984", 1949)); // Using constructor with title and year
        books.add(new Book()); // Using default constructor

        // Loop to read user input
        while (true) {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine(); // Reading the book title from user input
            if (title.isEmpty()) {
                break; // If the input is empty, break the loop
            }
            System.out.print("Enter number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine()); // Reading the number of pages from user input
            System.out.print("Enter publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine()); // Reading the publication year from user input
            books.add(new Book(title, numberOfPages, publicationYear)); // Adding a new Book object to the list
        }