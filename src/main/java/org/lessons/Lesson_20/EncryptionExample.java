package org.lessons.Lesson_20;

public class EncryptionExample {
    public static void main(String[] args) {

        String a = " ";
        String salt = "as12!";
        StringBuilder result = new StringBuilder();


        for (int i = 0; i < a.length(); i++) {
            char originalChar = a.charAt(i);
            result.append((char) (originalChar + 1)).append(salt);
        }
        System.out.println(result);
    }
}
