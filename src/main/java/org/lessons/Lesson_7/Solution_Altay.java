package org.lessons.Lesson_7;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_Altay {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String[] words = {"apple", "banana", "cherry", "orange", "grape"};
        String word = words[(int) (Math.random() * words.length)];
        char[] wordToArray = word.toCharArray();

        // banana -- b****

        char[] bos = new char[wordToArray.length];
        for (int i = 0; i < wordToArray.length; i++) {
            bos[i] = '*';
        }
        System.out.print(bos);
        System.out.print(word);


        int attempts = 4;
        boolean notFound = true;

        while (attempts > 0 && notFound) {
            boolean attempt = false;

            System.out.println("\nAttempts left: " + attempts);
            System.out.print("Enter letter: ");

            char s = userInput.nextLine().charAt(0);

            for (int i = 0; i < wordToArray.length; i++) {
                if (word.charAt(i) == s) {
                    bos[i] = s;
                    System.out.println(bos);
                    attempt = true;
                }
            }
            if (!attempt) {
                attempts--;
            }

            if (Arrays.equals(bos, wordToArray)) {
                System.out.println("tebrikler");
                notFound = false;
            }
        }
    }
}
