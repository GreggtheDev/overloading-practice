package org.example;

// Class representing a TV Show
public class TvShow {
    private String showName; // Attribute to store the name of the TV show
    private int numberOfEpisodes; // Attribute to store the number of episodes
    private String genre; // Attribute to store the genre of the TV show

    // Constructor with all parameters
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Constructor with name and genre, defaults number of episodes to 0
    public TvShow(String showName, String genre) {
        this(showName, 0, genre);
    }

    // Default constructor, defaults values
    public TvShow() {
        this("Unknown", 0, "Unknown");
    }

    // Getter method to retrieve the name of the TV show
    public String getShowName() {
        return showName;
    }

    // Getter method to retrieve the number of episodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter method to retrieve the genre of the TV show
    public String getGenre() {
        return genre;
    }

    // Overriding toString() method to return a string representation of the TvShow object
    @Override
    public String toString() {
        return "TvShow{showName='" + getShowName() + "', numberOfEpisodes=" + getNumberOfEpisodes() + ", genre='" + getGenre() + "'}";
    }
}