

### 1. Overloaded Constructors for Animal, TvShow, and Book Classes

#### Animal.java

```java
package org.example;

public class Animal {
    private String name;
    private boolean isDog;

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

    public String getName() {
        return name;
    }

    public boolean isDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return "Animal{name='" + getName() + "', isDog=" + isDog() + "}";
    }
}
```

#### MainAnimal.java

```java
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        // Adding objects using different constructors
        animals.add(new Animal("Buddy", true));
        animals.add(new Animal("Whiskers"));
        animals.add(new Animal());

        while (true) {
            System.out.print("Enter animal name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Is it a dog? (true/false): ");
            boolean isDog = Boolean.parseBoolean(scanner.nextLine());
            animals.add(new Animal(name, isDog));
        }

        System.out.println("Animals entered:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}
```

#### TvShow.java

```java
package org.example;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

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

    public String getShowName() {
        return showName;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "TvShow{showName='" + getShowName() + "', numberOfEpisodes=" + getNumberOfEpisodes() + ", genre='" + getGenre() + "'}";
    }
}
```

#### MainTvShow.java

```java
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainTvShow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TvShow> tvShows = new ArrayList<>();

        // Adding objects using different constructors
        tvShows.add(new TvShow("Breaking Bad", 62, "Crime"));
        tvShows.add(new TvShow("Friends", "Comedy"));
        tvShows.add(new TvShow());

        while (true) {
            System.out.print("Enter TV show name: ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }
            System.out.print("Enter number of episodes: ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter genre: ");
            String genre = scanner.nextLine();
            tvShows.add(new TvShow(showName, numberOfEpisodes, genre));
        }

        System.out.println("TV Shows entered:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
```

#### Book.java

```java
package org.example;

public class Book {
    private String title;
    private int numberOfPages;
    private int publicationYear;

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

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{title='" + getTitle() + "', numberOfPages=" + getNumberOfPages() + ", publicationYear=" + getPublicationYear() + "}";
    }
}
```

#### MainBook.java

```java
package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Adding objects using different constructors
        books.add(new Book("To Kill a Mockingbird", 281, 1960));
        books.add(new Book("1984", 1949));
        books.add(new Book());

        while (true) {
            System.out.print("Enter book title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Enter number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.print("What would you like to print (everything/name): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
```

### 2. Counter Class

#### Counter.java

```java
package org.example;

public class Counter {
    private int value;

    // Constructor that sets the start value of the counter to "startValue"
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this(0);
    }

    // Method that returns the current value of the counter
    public int value() {
        return value;
    }

    // Method that increases the value by 1
    public void increase() {
        value++;
    }

    // Overloaded method that increases the value by the value of increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Method that decreases the value by 1
    public void decrease() {
        value--;
    }

    // Overloaded method that decreases the value by the value of decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "Counter{value=" + value + "}";
    }
}
```

#### MainCounter.java

```java
package org.example;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        counter1.increase();
        counter2.increase(5);

        System.out.println("Value of counter1 after increase: " + counter1.value());
        System.out.println("Value of counter2 after increase by 5: " + counter2.value());

        counter1.decrease();
        counter2.decrease(3);

        System.out.println("Value of counter1 after decrease: " + counter1.value());
        System.out.println("Value of counter2 after decrease by 3: " + counter2.value());
    }
}
```

### Final Project Structure

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

### Updated README

---

# Java Objects and Lists Assignment

## Project Overview

This project contains four Java applications that manage and display information about Animals, TV Shows, Books, and a Counter. Each application collects user input, stores the information in objects, and then displays the collected information

.

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
