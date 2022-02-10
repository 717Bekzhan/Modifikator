package com.company.tech.appliances;

import com.company.tech.Tech;

import java.time.LocalDate;


public class Appliances extends Tech {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Appliances() {
    }

    public Appliances(String model) {
        this.model = model;
    }

    public Appliances(String name, String mark, String brand, LocalDate date, byte price, String model) {
        super(name, mark, brand, date, price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Appliances{" +
                "model='" + model + '\'' +
                "} " + super.toString();
    }
}


