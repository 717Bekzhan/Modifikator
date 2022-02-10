package com.company.tech.vehicles;

import java.time.LocalDate;

public class Car extends Vehicles{
    private String rightOrLeft;

    public String getRightOrLeft() {
        return rightOrLeft;
    }

    public void setRightOrLeft(String rightOrLeft) {
        this.rightOrLeft = rightOrLeft;
    }

    public Car() {
    }

    public Car(String rightOrLeft) {
        this.rightOrLeft = rightOrLeft;
    }

    public Car(String color, String rightOrLeft) {
        super(color);
        this.rightOrLeft = rightOrLeft;
    }

    public Car(String name, String mark, String brand, LocalDate date, byte price, String color, String rightOrLeft) {
        super(name, mark, brand, date,  price, color);
        this.rightOrLeft = rightOrLeft;
    }

    @Override
    public String toString() {
        return "Car{" +
                "rightOrLeft='" + rightOrLeft + '\'' +
                "} " + super.toString();
    }
}
