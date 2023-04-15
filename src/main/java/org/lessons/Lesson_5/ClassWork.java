package org.lessons.Lesson_5;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        boolean davam = true;


        while (davam) {
            if (value < 0) {
                System.out.println("Zehmet olmasa musbet eded daxil edin");
                value = scanner.nextInt();
            } else {
                System.out.println("Ededin kvadrati : " + value * value);
                davam = false;
            }
        }
    }
}
