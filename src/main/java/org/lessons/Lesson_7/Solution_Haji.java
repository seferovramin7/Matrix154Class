package org.lessons.Lesson_7;

import java.util.Scanner;

public class Solution_Haji {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salam Hangman oyununa xoş gəlmişsiniz");
        System.out.println(
                "Sizin qarşınızda duran məqsəd əfsanə " + ANSI_RED + "Milan" + ANSI_RESET +
                        " kadrosunun ilk" +
                        " 11-ə daxil olan oyunçulardan random olaraq birinin adını tapmaq");
        String[] words =
                {"Dida", "Cafu", "Nesta", "Stam", "Maldini", "Pirlo", "Gattuso", "Seedorf", "Kaka",
                        "Inzaghi",
                        "Shevchenko"};
        String rand = words[(int) (Math.random() * words.length)];
        char[] letters = new char[rand.length()];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

        int min = 0;
        int max = 5;

        while (min < max && new String(letters).contains("_") &&
                !new String(letters).equals(rand)) {
            System.out.println("Hərf daxil edin");
            char a = scanner.next().charAt(0);

            boolean milan = false;
            for (int i = 0; i < rand.length(); i++) {
                if (Character.toLowerCase(rand.charAt(i)) == a) {
                    letters[i] = a;
                    milan = true;
                }
            }

            if (!milan) {
                min++;
                System.out.println("Sizin cəhd sayınız " + (max - min));
            }

            System.out.println(letters);
        }
        if (min == max) {
            System.out.println("Öldürdün adamı");
        } else {
            System.out.println("Təbriklər");
        }
    }
}
