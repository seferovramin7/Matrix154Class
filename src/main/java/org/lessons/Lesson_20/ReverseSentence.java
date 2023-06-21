package org.lessons.Lesson_20;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        // Get input from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Reverse the sentence
        String reversedString = reverseSentenceUsingStringBuffer(sentence);

        // Output the reversed sentence
        System.out.println("Reversed Sentence: " + reversedString);
    }

    private static String reverseSentenceUsingString(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }

    private static String reverseSentenceUsingStringBuffer(String sentence) {
        StringBuffer stringBuffer = new StringBuffer(sentence);
        stringBuffer.reverse();
        return stringBuffer.toString();
    }

    private static String reverseSentenceUsingStringBuilder(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);
            if (i > 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}

