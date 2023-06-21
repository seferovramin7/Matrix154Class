package org.lessons.Lesson_18;

public class NegativeNumberException extends Exception {
    public NegativeNumberException() {
        super("Negative numbers are not allowed.");
    }
}