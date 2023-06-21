package org.lessons.Lesson_20;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Check if strings are anagrams
        boolean areAnagrams = checkAnagramUsingString(string1, string2);

        // Output the result
        if (areAnagrams) {
            System.out.println("The strings \"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
        } else {
            System.out.println("The strings \"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
        }
    }

    private static boolean checkAnagramUsingString(String string1, String string2) {
        // Remove whitespaces and convert to lowercase
        string1 = string1.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        // Sort the characters in both strings
        char[] chars1 = string1.toCharArray();
        char[] chars2 = string2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare the sorted strings
        return Arrays.equals(chars1, chars2);
    }

    private static boolean checkAnagramUsingStringBuffer(String string1, String string2) {
        // Remove whitespaces and convert to lowercase
        string1 = string1.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        // Create StringBuffers for both strings
        StringBuffer stringBuffer1 = new StringBuffer(string1);
        StringBuffer stringBuffer2 = new StringBuffer(string2);

        // Reverse the second string
        stringBuffer2.reverse();

        // Compare the modified strings
        return stringBuffer1.toString().equals(stringBuffer2.toString());
    }

    private static boolean checkAnagramUsingStringBuilder(String string1, String string2) {
        // Remove whitespaces and convert to lowercase
        string1 = string1.replaceAll("\\s", "").toLowerCase();
        string2 = string2.replaceAll("\\s", "").toLowerCase();

        // Create StringBuilders for both strings
        StringBuilder stringBuilder1 = new StringBuilder(string1);
        StringBuilder stringBuilder2 = new StringBuilder(string2);

        // Reverse the second string
        stringBuilder2.reverse();

        // Compare the modified strings
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}

