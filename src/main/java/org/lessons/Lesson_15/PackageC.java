package org.lessons.Lesson_15;

import java.util.Random;

public class PackageC {
    private int treasure;

    public void explore() {
        Random random = new Random();
        treasure = random.nextInt(10) + 1;

        System.out.println("Exploring Package C...");

        if (treasure > 5) {
            System.out.println("Congratulations! You found the treasure!");
        } else {
            System.out.println("Sorry, the treasure was not found.");
        }
    }

    public int getTreasure() {
        return treasure;
    }
}
