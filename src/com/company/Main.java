package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student student =new Student("Bekzhan","Rakhmankulov",LocalDate.of(2002,02,13),"bekzhan@gmail.com");
        Group group = new Group(new Student[]{student},"coding",LocalDate.of(2022,01,03));
        Cours cours = new Cours(new Group[]{group},"Peaksoft",43334455);

    }
}
