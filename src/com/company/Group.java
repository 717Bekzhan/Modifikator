package com.company;

import java.time.LocalDate;

public class Group {
    private Student[] students;
    private String learn;
    private LocalDate dedlain;

    public Group() {
    }

    public Group(Student[] students, String learn, LocalDate dedlain) {
        this.students = students;
        this.learn = learn;
        this.dedlain = dedlain;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }

    public LocalDate getDedlain() {
        return dedlain;
    }

    public void setDedlain(LocalDate dedlain) {
        this.dedlain = dedlain;
    }
}
