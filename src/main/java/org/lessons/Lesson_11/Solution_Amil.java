package org.lessons.Lesson_11;

import java.util.Random;

public class Solution_Amil {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] chekmek = new String[10][10];
        int userX = random.nextInt(10);
        int userY = random.nextInt(10);
        int exitX = random.nextInt(10);
        int exitY = random.nextInt(10);
        chekmek[userX][userX] = "U";
        chekmek[exitX][exitY] = "E";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (chekmek[i][j] == null) {
                    chekmek[i][j] = "#";
                }
                System.out.print(chekmek[i][j] + " ");

            }
            System.out.println();
        }

    }
}
