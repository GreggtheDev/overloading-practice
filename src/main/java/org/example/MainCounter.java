package org.example;

public class MainCounter {
    public static void main(String[] args) {
        // Creating Counter objects using different constructors
        Counter counter1 = new Counter(10); // Using constructor with start value
        Counter counter2 = new Counter(); // Using default constructor

        // Printing initial values
        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        // Using the increase methods
        counter1.increase();
        counter2.increase(5);

        // Printing values after increase
        System.out.println("Value of counter1 after increase: " + counter1.value());
        System.out.println("Value of counter2 after increase by 5: " + counter2.value());

        // Using the decrease methods
        counter1.decrease();
        counter2.decrease(3);

        // Printing values after decrease
        System.out.println("Value of counter1 after decrease: " + counter1.value());
        System.out.println("Value of counter2 after decrease by 3: " + counter2.value());
    }
}
