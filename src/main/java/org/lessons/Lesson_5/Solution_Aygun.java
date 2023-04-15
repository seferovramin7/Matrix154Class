package org.lessons.Lesson_5;

import java.util.Random;
import java.util.Scanner;

public class Solution_Aygun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int say = 0;
        int number = rnd.nextInt(1, 100); // (1,100)
        //int number = (int) (Math.random() * 100) + 1;
        boolean a = true;
        System.out.println("Enter the number: ");
        while (a) {
            int myNumber = sc.nextInt();
            if (myNumber > number) {
                System.out.println("too much");
            } else if (myNumber < number) {
                System.out.println("too low");
            } else {
                System.out.println("Congratulations! You win!!");
                System.out.println(++say + " steps");
                a = false;
            }
            say++;
        }
    }
}
