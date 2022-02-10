package com.company.tech.miltaryEquipment;

import java.time.LocalDate;

public class Gun extends Miltaryequipment{
   private String patron;

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public Gun() {
    }

    public Gun(String patron) {
        this.patron = patron;
    }

    public Gun(String tire, String patron) {
        super(tire);
        this.patron = patron;
    }

    public Gun(String name, String mark, String brand, LocalDate date, byte price, String tire, String patron) {
        super(name, mark, brand, date, price, tire);
        this.patron = patron;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "patron='" + patron + '\'' +
                "} " + super.toString();
    }
}
