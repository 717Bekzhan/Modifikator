package com.company.tech.miltaryEquipment;

import com.company.tech.Tech;

import java.time.LocalDate;

public class Miltaryequipment extends Tech {
    private String tire;

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }

    public Miltaryequipment() {
    }

    public Miltaryequipment(String tire) {
        this.tire = tire;
    }

    public Miltaryequipment(String name, String mark, String brand, LocalDate date, byte price, String tire) {
        super(name, mark, brand, date, price);
        this.tire = tire;
    }

    @Override
    public String toString() {
        return "Miltaryequipment{" +
                "tire='" + tire + '\'' +
                "} " + super.toString();
    }
}
