package org.lessons.Lesson_22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Lamp {
    private String color;

    public Lamp(String color) {
        this.color = color;
    }

    public void turnOn() {
        System.out.println("The lamp is turned on.");
    }

    private void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("The lamp color has been changed to " + color + ".");
    }
}

public class ReflectionDemo {
    public static void main(String[] args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException, NoSuchFieldException {
        // Accessing class information using Reflection
        Class<Lamp> lampClass = Lamp.class;

        // Get the class name
        System.out.println("Class Name: " + lampClass.getName());

        // Accessing constructor using Reflection
        Constructor<Lamp> constructor = lampClass.getConstructor(String.class);

        // Creating an instance using the constructor
        Lamp lamp = constructor.newInstance("Red");

        // Accessing fields using Reflection
        Field colorField = lampClass.getDeclaredField("color");
        System.out.println("----------------------------");
        System.out.println(colorField);
        System.out.println("----------------------------");


        // Setting accessible to true to access a private field
        colorField.setAccessible(true);

        // Modifying the value of the field
        colorField.set(lamp, "Blue");

        // Accessing and invoking a method using Reflection
        Method turnOnMethod = lampClass.getMethod("turnOn");
        turnOnMethod.invoke(lamp);

        // Accessing and invoking a private method using Reflection
        Method changeColorMethod = lampClass.getDeclaredMethod("changeColor", String.class);
        changeColorMethod.setAccessible(true);
        changeColorMethod.invoke(lamp, "Green");
    }
}
