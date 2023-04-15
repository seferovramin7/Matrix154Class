package org.lessons.Lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Solution_Haji {
    public static void main(String[] args) {
        Random randomNum = new Random();
        int showMe = randomNum.nextInt(100);
        boolean cond = true;
        //   System.out.println("Random number between 1 and 100: " + showMe);
        while (cond) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (showMe == a) {
                System.out.println("Congratulations!");
            } else if (showMe < a) {
                System.out.println("Too high!");
            } else if (showMe > a) {
                System.out.println("Too low!");
            }
        }
    }
}
