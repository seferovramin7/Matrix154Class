package org.lessons.Lesson_12;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Ali", 20, 5000);
        Businessman businessman = new Businessman("Ali", 20, 5000);
    }
}

class Employee extends Person {
    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);  // call the constructor of the Person class
        this.salary = salary;
    }
}
    class Businessman extends Person {
        private double income;

        public Businessman(String name, int age, double income) {
            super(name, age);  // call the constructor of the Person class
            this.income = income;
        }
    }
