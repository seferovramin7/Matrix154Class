package org.lessons.Lesson_11;

public class Math {

    int a;
    int b;
    int balance;

    public Math(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Math(){
    }

    public Math(float a, int b){

    }



    Math math = new Math(2,3);
    Math math2 = new Math(2,3);

    public static void main(String[] args) {
        int result = add(4, 5);
        System.out.println(result);
    }

    // Method Overloading
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }
}
