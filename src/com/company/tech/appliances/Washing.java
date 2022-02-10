package com.company.tech.appliances;

import java.time.LocalDate;

public class Washing extends Appliances{
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Washing() {
    }

    public Washing(String model) {
        super(model);
    }

    public Washing(String name, String mark, String brand, LocalDate date, byte price, String model) {
        super(name, mark, brand, date, price, model);
    }

    @Override
    public String toString() {
        return "Washing{" +
                "country='" + country + '\'' +
                '}';
    }
}
