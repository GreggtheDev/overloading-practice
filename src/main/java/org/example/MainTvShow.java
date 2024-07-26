package org.example;

import java.util.ArrayList; // Importing ArrayList to store TvShow objects
import java.util.Scanner; // Importing Scanner to read user input

public class MainTvShow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        ArrayList<TvShow> tvShows = new ArrayList<>(); // Creating an ArrayList to store TvShow objects

        // Adding objects using different constructors
        tvShows.add(new TvShow("Breaking Bad", 62, "Crime")); // Using constructor with all parameters
        tvShows.add(new TvShow("Friends", "Comedy")); // Using constructor with name and genre
        tvShows.add(new TvShow()); // Using default constructor

        // Loop to read user input
        while (true) {
            System.out.print("Enter TV show name: ");
            String showName = scanner.nextLine(); // Reading the TV show name from user input
            if (showName.isEmpty()) {
                break; // If the input is empty, break the loop
            }
            System.out.print("Enter number of episodes: ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine()); // Reading the number of episodes from user input
            System.out.print("Enter genre: ");
            String genre = scanner.nextLine(); // Reading the genre from user input
            tvShows.add(new TvShow(showName, numberOfEpisodes, genre)); // Adding a new TvShow object to the list
        }