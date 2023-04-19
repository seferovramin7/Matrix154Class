package org.lessons.Lesson_7;

import java.util.Scanner;

public class Solution_Giyas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lives = 3;
        String[] words = new String[] {"apple", "banana", "cherry", "orange", "grape"};
        String randomValue = words[(int) (Math.random() * words.length)];
        System.out.println("Sozun uzunlugu:  " + randomValue.length());
        String notUsed = "qwertyuiopasdfghjklzxcvbnm";
        char[] letters = new char[randomValue.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }
        while (lives > 0) {


            System.out.print("Lives:");
            for (int i = 0; i < lives; i++) {
                System.out.print("0");
            }
            System.out.println();
            System.out.print("Herif daxil edin:");
            String input = scanner.next();
            char letter = input.charAt(0);

            boolean isGuessCorrect = false;
            System.out.println();
            for (int i = 0; i < randomValue.length(); i++) {
                char l = randomValue.charAt(i);
                if (l == letter) {
                    letters[i] = l;
                    isGuessCorrect = true;
                }
            }
            if (!isGuessCorrect) {
                --lives;
            }
            boolean gameEnd = true;
            System.out.print("Soz:");
            for (int l = 0; l < letters.length; l++) {
                if (letters[l] == '_') {
                    gameEnd = false;
                }
                System.out.print(letters[l]);
            }

            System.out.println();
            notUsed = notUsed.replace(letter, '_');
            System.out.println("Istifade olunan herifler:" + notUsed);
            System.out.println("_______________");
            if (gameEnd) {
                System.out.println("Tebrikler  " + "Soz:" + randomValue);
                break;
            }
        }
        if (lives == 0) {
            System.out.println("Meglub oldunuz!" + "Soz: " + randomValue);
        }
        System.out.println("Oyun bitdi!");
    }
}
