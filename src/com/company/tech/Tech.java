package com.company.tech;

import java.time.LocalDate;

public class Tech {
    private String name;
    private String mark;
    private String brand;
    private LocalDate date;
    private byte price;

    public Tech() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public byte getPrice() {
        return price;
    }

    public void setPrice(byte price) {
        this.price = price;
    }


    public Tech(String name, String mark, String brand, LocalDate date, byte price) {
        this.name = name;
        this.mark = mark;
        this.brand = brand;
        this.date = date;
        this.price = price;


    }

    @Override
    public String toString() {
        return "Tech{" +
                "name='" + name + '\'' +
                ", mark='" + mark + '\'' +
                ", brand='" + brand + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
