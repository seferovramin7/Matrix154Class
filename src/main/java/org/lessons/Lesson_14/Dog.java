package org.lessons.Lesson_14;

public class Dog extends Animal {

    private double length;
    private double width;

    public Dog(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String sound() {
        return "Woof";
    }
}
