package org.lessons.Lesson_13;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ObjectComparisonExample {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        Person person3 = person1;

        System.out.println("Using equals():");
        System.out.println(person1.equals(person2));  // true
        System.out.println(person1.equals(person3));  // true

        System.out.println("Using == operator:");
        System.out.println(person1 == person2);       // false
        System.out.println(person1 == person3);       // true

    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return false;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        return new EqualsBuilder().append(name, person.name)
                .isEquals();
    }


}
