package com.company.tech.appliances;

import java.time.LocalDate;

public class Fridge extends Appliances {
    private String withFreezer;

    public Fridge() {
    }

    public String getWithFreezer() {
        return withFreezer;
    }

    public void setWithFreezer(String withFreezer) {
        this.withFreezer = withFreezer;
    }

    public Fridge(String withFreezer) {
        this.withFreezer = withFreezer;
    }

    public Fridge(String name, String mark, String brand, LocalDate date, byte price, String model) {
        super(name, mark, brand, date, price, model);
    }

    public Fridge(String model, String withFreezer) {
        super(model);
        this.withFreezer = withFreezer;
    }

    public Fridge(String name, String mark, String brand, LocalDate date, byte price, String model, String withFreezer) {
        super(name, mark, brand, date, price, model);
        this.withFreezer = withFreezer;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "withFreezer='" + withFreezer + '\'' +
                "} " + super.toString();
    }
}
