package org.lessons.Lesson_9;

public class Solution {
    public static void main(String[] args) {
        int qaliq;
        int input = 12122121;
        int sum = 0;
        int temp;
        temp = input;

        System.out.println(input/10);
        System.out.println(input%10);


        // 12122121

        // 1
        // 1 * 10 = 10 + 2 = 12
        //


        while (input > 0) {
            qaliq = input % 10;
            sum = (sum * 10) + qaliq;
            input = input / 10;
        }
        if (temp == sum) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not palindrome");
        }
    }
}
