package org.lessons.Lesson_20;

public class StringExamples {
    public static void main(String[] args) {
        // Using String
        String str = "Hello";
        str += " World!";
        System.out.println(str);

        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World!");
        stringBuffer.append("sdsdsds");
        System.out.println(stringBuffer);

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World!");
        System.out.println(stringBuilder);
    }
}
