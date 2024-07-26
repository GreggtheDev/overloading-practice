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
