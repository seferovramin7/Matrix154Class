package org.lessons.Lesson_3;

import java.util.Scanner;

public class Solution_Leyla {
    public static void main(String[] args) {
        System.out.println("Please enter your score: ");
        Scanner scanner = new Scanner(System.in);
        int yourResult = scanner.nextInt();
        String score = null;
        int a = (yourResult <= 59 && yourResult >= 0) ? 1 : 2;
        switch (a) {
            case 1:
                score = "F";
                break;
            case 2:
                if (yourResult >= 60 && yourResult < 70) {
                    score = "D";
                    break;
                } else if (yourResult >= 70 && yourResult < 80) {
                    score = "C";
                    break;
                } else if (yourResult >= 80 && yourResult < 90) {
                    score = "B";
                    break;
                } else if (yourResult >= 90 && yourResult <= 100) {
                    score = "A";
                    break;
                }
            default:
                score = "invalid number";
        }
        System.out.println("Your score is " + score);
    }

}
