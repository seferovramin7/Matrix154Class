package org.lessons.Lesson_18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Car {
    private String name;
    private int price;
    private int stock;

    public Car(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // try with resources
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream(new File("myfile.txt"))) {
            byte[] data = new byte[(int) fis.available()];
            fis.read(data);
            System.out.println(new String(data));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
