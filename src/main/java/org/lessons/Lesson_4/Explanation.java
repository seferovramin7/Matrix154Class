package org.lessons.Lesson_4;

import java.util.Scanner;

public class Explanation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter an integer: ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                input.next(); // consume the invalid input
            }
            num = input.nextInt();
        } while (num <= 0);

        System.out.println("You entered: " + num);
    }
}
