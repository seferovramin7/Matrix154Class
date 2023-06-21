package org.lessons.Lesson_15;

import java.util.Scanner;

public class MainClass {


    String name;
    String image;


    public static void main(String[] args) {
        PackageA packageA = new PackageA();
        PackageB packageB = new PackageB();
        PackageC packageC = new PackageC();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Package Explorer Game!");
        System.out.println("Choose a package to explore (1, 2, or 3):");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                packageA.explore();
                break;
            case 2:
                packageB.explore();
                break;
            case 3:
                packageC.explore();
                break;
            default:
                System.out.println("Invalid choice! Game Over.");
        }
    }
}
