package org.lessons.Lesson_20;

import java.util.Scanner;

public class StringEncryption {
    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Encrypt the string using different methods
        String encryptedStringString = encryptStringUsingString(inputString);
        String encryptedStringStringBuffer = encryptStringUsingStringBuffer(inputString);
        String encryptedStringStringBuilder = encryptStringUsingStringBuilder(inputString);

        // Output the encrypted strings
        System.out.println("Using String: " + encryptedStringString);
        System.out.println("Using StringBuffer: " + encryptedStringStringBuffer);
        System.out.println("Using StringBuilder: " + encryptedStringStringBuilder);
    }

    private static String encryptStringUsingString(String inputString) {
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char originalChar = inputString.charAt(i);
            char encryptedChar = (char) (originalChar + 1);
            encryptedString.append(encryptedChar);
        }
        encryptedString.append("!");
        return encryptedString.toString();
    }

    private static String encryptStringUsingStringBuffer(String inputString) {
        StringBuffer encryptedString = new StringBuffer();
        for (int i = 0; i < inputString.length(); i++) {
            char originalChar = inputString.charAt(i);
            char encryptedChar = (char) (originalChar + 1);
            encryptedString.append(encryptedChar);
        }
        encryptedString.append("!");
        return encryptedString.toString();
    }

    private static String encryptStringUsingStringBuilder(String inputString) {
        StringBuilder encryptedString = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char originalChar = inputString.charAt(i);
            char encryptedChar = (char) (originalChar + 1);
            encryptedString.append(encryptedChar);
        }
        encryptedString.append("!");
        return encryptedString.toString();
    }
}

