package org.lessons.Lesson_18;

public class ExceptionPlayground {
    public static void main(String[] args) {
        try {
            int number = -10;
            if (number < 0) {
                throw new NegativeNumberException();
            }
            // Other code logic here...
        } catch (NegativeNumberException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}
