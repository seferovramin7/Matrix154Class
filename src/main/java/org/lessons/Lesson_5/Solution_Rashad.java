package org.lessons.Lesson_5;

import java.util.Scanner;

public class Solution_Rashad {
    public static void main(String[] args) {
        int userInput, min, max, range, randomNo;

        // Set the range
        min = 1;
        max = 100;
        range = max - min;

        // Generate random number and cast to an integer
        randomNo = (int) (Math.random() * range) + min;

        // Print the secret number on the console if needed
        System.out.println("The secret No. is -->> " + randomNo);

        // Initiate user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess the number: ");
        userInput = scan.nextInt();

        // The main code block to prompt the user to guess the secret number
        while (userInput != randomNo) {

            // Notify the user if the difference is around 'four'
            String diff = ((userInput - randomNo) <= 4 && (userInput - randomNo) >= -4) ? "You are very close! " : null;
            if (diff != null) {
                System.out.print(diff);
                System.out.print("Enter a new number: ");
                userInput = scan.nextInt();

                // Notify the user if the given number is too high
            } else if ((userInput - randomNo) > 4) {
                System.out.print("Too high! ");
                System.out.print("Enter a new number: ");
                userInput = scan.nextInt();

                // Notify the user if the given number is too low
            } else if ((userInput - randomNo) < -4) {
                System.out.print("Too low! ");
                System.out.print("Enter a new number: ");
                userInput = scan.nextInt();

                // If the guess is correct, exit the loop and output the result.
            } else if (userInput == randomNo) {
                break;
            }
        }
        System.out.println("Congratulations!");
    }
}
