package com.esteban.exercise_2;

public class Student {
    private double note_1;
    private double note_2;
    private double note_3;
    private String name;
    private int year;

    public double getNote_1() {
        return note_1;
    }

    public void setNote_1(double note_1) {
        this.note_1 = note_1;
    }

    public double getNote_2() {
        return note_2;
    }

    public void setNote_2(double note_2) {
        this.note_2 = note_2;
    }

    public double getNote_3() {
        return note_3;
    }

    public void setNote_3(double note_3) {
        this.note_3 = note_3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student() {
        this.note_1 = 0;
        this.note_2 = 0;
        this.note_3 = 0;
        this.name = "";
        this.year = 0;
    }

    public Student(double note_1, double note_2, double note_3, String name, int year) {
        this.note_1 = note_1;
        this.note_2 = note_2;
        this.note_3 = note_3;
        this.name = name;
        this.year = year;
    }

    public Student(Student student) {
        this.note_1 = student.note_1;
        this.note_2 = student.note_2;
        this.note_3 = student.note_3;
        this.name = student.name;
        this.year = student.year;
    }

    public double finalNote() {
        double sumTwoNotes = (this.note_1 + this.note_2) * 0.7; //70%
        double sumSevenNote = this.note_3 * 0.3; //30%
        double sumNotes = sumTwoNotes + sumSevenNote;
        return sumNotes;
    }

    public String status() {
        return "this is your note 1: " + this.note_1 + " this is your note 2: " + this.note_2 + " this is your note 3: " + this.note_3 + " your name: " + this.name + " and this is your year old: " + this.year;
    }
}
