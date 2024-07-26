
# Java Objects and Lists Assignment

## Project Overview

This project contains four Java applications that manage and display information about Animals, TV Shows, Books, and a Counter. Each application collects user input, stores the information in objects, and then displays the collected information.

## Folder Structure

The project directory is organized as follows:

```
src/main/java/org/example/
    ├── Animal.java
    ├── MainAnimal.java
    ├── TvShow.java
    ├── MainTvShow.java
    ├── Book.java
    ├── MainBook.java
    ├── Counter.java
    └── MainCounter.java
```

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor (e.g., VS Code) with Java support.

### Running the Applications

1. **Clone the Repository**

   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Compile and Run**

   Navigate to the `src/main/java/org/example/` directory and compile the Java files using the following commands:

   ```bash
   javac Animal.java MainAnimal.java
   javac TvShow.java MainTvShow.java
   javac Book.java MainBook.java
   javac Counter.java MainCounter.java
   ```

   Run the applications using the following commands:

   ```bash
   java org.example.MainAnimal
   java org.example.MainTvShow
   java org.example.MainBook
   java org.example.MainCounter
   ```

## Applications

### Animal Application

The `Animal` application allows users to enter the name of an animal and specify whether it is a dog. The program continues to prompt the user for input until an empty name is entered. It then displays the list of animals entered.

**Classes:**
- `Animal`
  - Attributes: `name` (String), `isDog` (boolean)
  - Methods: `getName()`, `isDog()`, `toString()`
  - Constructors: `Animal(String name, boolean isDog)`, `Animal(String name)`, `Animal()`
- `MainAnimal`
  - Contains the main method and handles user interaction.

### TV Show Application

The `TvShow` application allows users to enter information about TV shows, including the show's name, number of episodes, and genre. The program continues to prompt the user for input until an empty name is entered. It then displays the list of TV shows entered.

**Classes:**
- `TvShow`
  - Attributes: `showName` (String), `numberOfEpisodes` (int), `genre` (String)
  - Methods: `getShowName()`, `getNumberOfEpisodes()`, `getGenre()`, `toString()`
  - Constructors: `TvShow(String showName, int numberOfEpisodes, String genre)`, `TvShow(String showName, String genre)`, `TvShow()`
- `MainTvShow`
  - Contains the main method and handles user interaction.

### Book Application

The `Book` application allows users to enter information about books, including the book's title, number of pages, and publication year. The program continues to prompt the user for input until an empty title is entered. The user is then asked whether they want to print "everything" or just the "name" of the books.

**Classes:**
- `Book`
  - Attributes: `title` (String), `numberOfPages` (int), `publicationYear` (int)
  - Methods: `getTitle()`, `getNumberOfPages()`, `getPublicationYear()`, `toString()`
  - Constructors: `Book(String title, int numberOfPages, int publicationYear)`, `Book(String title, int publicationYear)`, `Book()`
- `MainBook`
  - Contains the main method and handles user interaction.

### Counter Application

The `Counter` application allows users to increment and decrement a counter value using various methods.

**Classes:**
- `Counter`
  - Attribute: `value` (int)
  - Methods: `value()`, `increase()`, `increase(int increaseBy)`, `decrease()`, `decrease(int decreaseBy)`, `toString()`
  - Constructors: `Counter(int startValue)`, `Counter()`
- `MainCounter`
  - Contains the main method and demonstrates usage of the Counter class methods.

## Example Output

### Animal Application

```
Enter animal name: Doggo
Is it a dog? (true/false): true
Enter animal name: Whiskers
Is it a dog? (true/false): false
Enter animal name: 
Animals entered:
Animal{name='Doggo', isDog=true}
Animal{name='Whiskers', isDog=false}
Animal{name='Buddy', isDog=true}
Animal{name='Whiskers', isDog=false}
Animal{name='Unknown', isDog=false}
```

### TV Show Application

```
Enter TV show name: Breaking Bad
Enter number of episodes: 62
Enter genre: Crime
Enter TV show name: Friends
Enter number of episodes: 236
Enter genre: Comedy
Enter TV show name: 
TV Shows entered:
TvShow{showName='Breaking Bad', numberOfEpisodes=62, genre='Crime'}
TvShow{showName='Friends', numberOfEpisodes=236, genre='Comedy'}
TvShow{showName='Unknown', numberOfEpisodes=0, genre='Unknown'}
```

### Book Application

```
Enter book title: To Kill a Mockingbird
Enter number of pages: 281
Enter publication year: 1960
Enter book title: 1984
Enter number of pages: 328
Enter publication year: 1949
Enter book title: 
What would you like to print (everything/name): everything
Book{title='To Kill a Mockingbird', numberOfPages=281, publicationYear=1960}
Book{title='1984', numberOfPages=328, publicationYear=1949}
Book{title='Unknown', numberOfPages=0, publicationYear=0}
```

### Counter Application

```
Initial value of counter1: 10
Initial value of counter2: 0
Value of counter1 after increase: 11
Value of counter2 after increase by 5: 5
Value of counter1 after decrease: 10
Value of counter2 after decrease by 3: 2
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

This README provides a clear overview of the project, its structure, and how to run the applications. Make sure to adjust any paths or details to fit your specific setup.
