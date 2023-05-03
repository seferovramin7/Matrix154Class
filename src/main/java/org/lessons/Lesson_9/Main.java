package org.lessons.Lesson_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person tom = new Person();

        tom.setName("Resid", "Allahverdi");

        Scanner scanner = new Scanner(System.in);
        boolean notValidAge = true;
        while (notValidAge) {
            int yas = scanner.nextInt();
            if (yas > 0) {
                notValidAge = false;
                tom.age = yas;
            }
        }
        System.out.println(tom);
    }
}
