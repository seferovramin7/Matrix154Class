package org.lessons.Lesson_6;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "cherry", "orange", "grape"};
        String word = words[(int) (Math.random() * words.length)];
        char[] hiddenWord = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            hiddenWord[i] = '_';
        }

        int remainingGuesses = 6;
        Scanner input = new Scanner(System.in);
        while (remainingGuesses > 0) {

            System.out.println("Guess a letter: ");
            char guess = input.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    hiddenWord[i] = guess;
                    found = true;
                }
            }
            if (!found) {
                remainingGuesses--;
            }
            System.out.println(hiddenWord);
            if (word.equals(String.valueOf(hiddenWord))) {
                System.out.println("Congratulations, you guessed the word!");
                return;
            }
        }
        System.out.println("You ran out of guesses. The word was: " + word);
    }
}

