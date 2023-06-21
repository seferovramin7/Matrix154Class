package org.lessons.Lesson_12;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void animalVoice() {
        System.out.println("An animal speaks!");
    }
}

// Animals
// Dogs
// Retrievers
// Golden




class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Fido");

        dog.animalVoice();
    }
}
