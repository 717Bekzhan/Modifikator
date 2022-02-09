package com.company;

public class Cours {
    private Group[]groups;
    private String nameOfCours;
    private byte phoneNumber;
    private String teacherName;

    public Cours(Group[] groups, String peaksoft, int i) {
    }

    public Cours(Group[] groups, String nameOfCours, byte phoneNumber, String teacherName) {
        this.groups = groups;
        this.nameOfCours = nameOfCours;
        this.phoneNumber = phoneNumber;
        this.teacherName = teacherName;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public String getNameOfCours() {
        return nameOfCours;
    }

    public void setNameOfCours(String nameOfCours) {
        this.nameOfCours = nameOfCours;
    }

    public byte getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(byte phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
