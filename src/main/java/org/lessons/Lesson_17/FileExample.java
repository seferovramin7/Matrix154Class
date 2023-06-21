package org.lessons.Lesson_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            System.out.println(first / second);
        } catch (ArithmeticException e) {
            System.out.println("Riyazi əməliyyatda səhv var");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Zehmet olmasa duzgun daxil edin");
            System.out.println(e.getMessage());
        }
    }
}
