package org.example;

// Class representing a Book
public class Book {
    private String title; // Attribute to store the title of the book
    private int numberOfPages; // Attribute to store the number of pages
    private int publicationYear; // Attribute to store the publication year

    // Constructor with all parameters
    public Book(String title, int numberOfPages, int publicationYear) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    // Constructor with title and year, defaults number of pages to 0
    public Book(String title, int publicationYear) {
        this(title, 0, publicationYear);
    }

    // Default constructor, defaults values
    public Book() {
        this("Unknown", 0, 0);
    }

    // Getter method to retrieve the title of the book
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve the number of pages
    public int getNumberOfPages() {
        return numberOfPages;
    }

    // Getter method to retrieve the publication year
    public int getPublicationYear() {
        return publicationYear;
    }

    // Overriding toString() method to return a string representation of the Book object
    @Override
    public String toString() {
        return "Book{title='" + getTitle() + "', numberOfPages=" + getNumberOfPages() + ", publicationYear=" + getPublicationYear() + "}";
    }
}
