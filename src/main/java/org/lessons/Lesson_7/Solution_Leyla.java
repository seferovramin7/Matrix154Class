package org.lessons.Lesson_7;

import java.util.Scanner;

public class Solution_Leyla {
    public static void main(String[] args) {
        System.out.println("Welcome to our Hangman game!");

        String[] secretWords = {"apple", "banana", "cherry", "orange", "grape"};
        String randomWord = secretWords[(int) (Math.random() * secretWords.length)];
        char[] letters = new char[randomWord.length()];
        System.out.println("The word has " + randomWord.length() + " letters. ");

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }
        int lives = 7;
        Scanner scanner = new Scanner(System.in);
        while (lives > 0) {
            System.out.print("\n" + "Lives: ");
            for (int i = 0; i < lives; i++) {
                System.out.print("0");
            }
            System.out.println();
            System.out.println("Please, guess a letter: ");
            String guess = scanner.nextLine();
            char letter = guess.charAt(0);

            boolean isGuessCorrect = false;
            for (int i = 0; i < randomWord.length(); i++) {
                char l = randomWord.charAt(i);
                if (l == letter) {
                    letters[i] = l;
                    isGuessCorrect = true;
                }
            }
            if (!isGuessCorrect) {
                lives--;
            }
            boolean isGameFinished = true;
            System.out.println("Word");
            for (int i = 0; i < letters.length; i++) {
                if (letters[i] == '_') {
                    isGameFinished = false;
                }
                System.out.print(letters[i]);
            }
            System.out.println();
            System.out.println("---------------------------------------");
            if (isGameFinished) {
                System.out.println("Congrats! You won!");
                break;
            }
        }
        if (lives == 0) {
            System.out.println("You lost! Game over! The word was " + randomWord);
        }
        System.out.println("Exciting game");
    }
}
