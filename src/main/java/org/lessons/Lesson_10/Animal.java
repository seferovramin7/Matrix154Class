package org.lessons.Lesson_10;

public class Animal {
    String name;
    Integer age;
    String color;
    String voice;


    public Animal() {
    }


    public Animal(String name, Integer age, String color, String voice) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.voice = voice;
    }

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public Animal(String name, Integer age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void makeSound() {
        System.out.println("Makes sound");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}
