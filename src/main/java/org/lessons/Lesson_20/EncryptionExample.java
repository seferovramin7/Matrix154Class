package org.lessons.Lesson_20;

public class EncryptionExample {
    public static void main(String[] args) {

        String a = "a";
        char b = 'a';


        for (int i = 0; i < a.length(); i++) {
            char originalChar = a.charAt(i);
            b = (char) (originalChar + 1);
        }
        System.out.println(b);
    }
}
