package org.lessons.Lesson_9;

public class Person {
    String name;
    String surname;
    int age;

    public String getName() {
        return "Ad : " + this.name;
    }

    public void setName(String ad, String patronymic) {
        this.name = ad  + " " + patronymic + " oglu";
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}


