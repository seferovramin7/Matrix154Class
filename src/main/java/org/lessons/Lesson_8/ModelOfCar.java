package org.lessons.Lesson_8;

public class ModelOfCar {
    String make;
    String model;

    int horsePower;

    int doors;
    boolean ifConvertible;

    void engineStart(){
        System.out.println("Ready to go !");
    }

    int odometerValue(){
        return 100000;
    }


    // alt + enter || command + N || alt + insert

    public ModelOfCar(String make, String model, int horsePower, int doors, boolean ifConvertible) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
        this.doors = doors;
        this.ifConvertible = ifConvertible;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isIfConvertible() {
        return ifConvertible;
    }

    public void setIfConvertible(boolean ifConvertible) {
        this.ifConvertible = ifConvertible;
    }

    @Override
    public String toString() {
        return "ModelOfCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", doors=" + doors +
                ", ifConvertible=" + ifConvertible +
                '}';
    }
}
