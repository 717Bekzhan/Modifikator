package com.company.tech.vehicles;

import java.time.LocalDate;

public class Truck extends Vehicles{
    private String benzaOrDizel;

    public String getBenzaOrDizel() {
        return benzaOrDizel;
    }

    public void setBenzaOrDizel(String benzaOrDizel) {
        this.benzaOrDizel = benzaOrDizel;
    }

    public Truck() {
    }

    public Truck(String benzaOrDizel) {
        this.benzaOrDizel = benzaOrDizel;
    }

    public Truck(String color, String benzaOrDizel) {
        super(color);
        this.benzaOrDizel = benzaOrDizel;
    }

    public Truck(String name, String mark, String brand, LocalDate date, byte price, String color, String benzaOrDizel) {
        super(name, mark, brand, date, price, color);
        this.benzaOrDizel = benzaOrDizel;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "benzaOrDizel='" + benzaOrDizel + '\'' +
                "} " + super.toString();
    }
}
