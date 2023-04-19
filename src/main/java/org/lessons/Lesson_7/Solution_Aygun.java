package org.lessons.Lesson_7;

import java.util.Scanner;

public class Solution_Aygun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tWelcome game, lets start!!");
        System.out.println("=================================");
        String[] words = {"apple", "banana", "cherry", "orange", "grape", "melon"};
        String word = words[(int) (Math.random() * words.length)];
        boolean isSolved = false;
        char[] hiddenWord = new char[word.length()];

        for (int i = 0; i < hiddenWord.length; i++) {
            hiddenWord[i] = '*';
        }
        System.out.print("The word you have to find => ");
        System.out.println(hiddenWord);
        int guess = 7;

        while (guess > 0 && !isSolved) {
            System.out.print("Please enter letter: ");
            String letter = sc.next();
            boolean isLetterEqual = false;

            for (int i = 0; i < word.length(); i++) {
                if (letter.charAt(0) == word.charAt(i)) {
                    System.out.println("Correct letter! keep going..");
                    hiddenWord[i] = word.charAt(i);
                    isLetterEqual = true;
                    System.out.println(hiddenWord);
                }
            }
            if (!isLetterEqual) {
                guess--;
                System.err.println("you have " + guess + " lives");
            }

            int hiddenLetter = 0;
            for (int i = 0; i < word.length(); i++) {
                if ('*' == hiddenWord[i]) {
                    hiddenLetter++;
                }
            }
            if (hiddenLetter > 0) {
                isSolved = false;
            } else {
                isSolved = true;
            }
        }

        if (isSolved) {
            System.out.println("\nCongratulations! You win!!!");
        } else {
            System.out.println("\n\nYou Lost :( \nTry again");
        }
    }
}
