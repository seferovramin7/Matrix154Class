package org.lessons.Lesson_13;

public class ClassWork {

    String title;

    public ClassWork(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        //overload vs override


        ClassWork javaClass1 = new ClassWork("Test");
        ClassWork javaClass2 = new ClassWork("Test");


        System.out.println(javaClass1.equals(javaClass2));
        System.out.println(javaClass1 == javaClass2);

    }

    public void setTime(){

    }

    public void setTime(int a){

    }

    public void setTime(long a){

    }

}

class MatrixClass extends ClassWork{
    public MatrixClass(String title) {
        super(title);
    }

    @Override
    public void setTime() {
        super.setTime();
    }

    @Override
    public void setTime(int a) {
        super.setTime(a);
    }

    @Override
    public void setTime(long a) {
        super.setTime(a);
    }
}
