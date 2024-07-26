package org.example;

// Class representing a Counter
public class Counter {
    private int value; // Attribute to store the current value of the counter

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

    // Overriding toString() method to return a string representation of the Counter object
    @Override
    public String toString() {
        return "Counter{value=" + value + "}";
    }
}
