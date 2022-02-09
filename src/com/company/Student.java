package com.company;

import java.time.LocalDate;

public class Student {
    private String nameOfStudent;
    private String lastName;
    private  LocalDate dateOfBirthday;
    private String gmail;

    public Student() {
    }

    public Student(String nameOfStudent, String lastName, LocalDate dateOfBirthday, String gmail) {
        this.nameOfStudent = nameOfStudent;
        this.lastName = lastName;
        if (dateOfBirthday.isAfter(LocalDate.now())){
            System.out.println("error");
        }else {
            this.dateOfBirthday = dateOfBirthday;
        }
        this.gmail = gmail;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate dateOfBirthday) {
        if (dateOfBirthday.isAfter(LocalDate.now())){
            System.out.println("eerrer");
        }else {
            this.dateOfBirthday = dateOfBirthday;
        }
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}
