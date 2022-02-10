package com.company.tech.miltaryEquipment;

import java.time.LocalDate;

public class Tank extends Miltaryequipment {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Tank() {
    }

    public Tank(String type) {
        this.type = type;
    }

    public Tank(String tire, String type) {
        super(tire);
        this.type = type;
    }

    public Tank(String name, String mark, String brand, LocalDate date, byte price, String tire, String type) {
        super(name, mark, brand, date, price, tire);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
