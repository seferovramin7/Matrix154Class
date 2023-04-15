package org.lessons.Lesson_5;

import java.util.Scanner;

public class Solution_Shabnam {
    public static void main(String[] args) {
        int min=1;
        int max=100;
        int randomNumber = (int) (Math.random() * max) + min;

        System.out.print("Please, Enter a number between 1 and 100: ");

        Scanner scanner = new Scanner(System.in);
        int enteredNumber = scanner.nextInt();

        while (enteredNumber != randomNumber) {
            if (enteredNumber > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            System.out.print("Guess again: ");
            enteredNumber = scanner.nextInt();
        }

        System.out.println("Congratulations!");
    }
}
