package com.company.tech.vehicles;

import com.company.tech.Tech;

import java.time.LocalDate;

public class Vehicles extends Tech {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicles() {
    }

    public Vehicles(String color) {
        this.color = color;
    }

    public Vehicles(String name, String mark, String brand, LocalDate date, byte price, String color) {
        super(name, mark, brand, date, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
