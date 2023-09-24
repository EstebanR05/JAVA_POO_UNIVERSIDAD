package com.esteban.exercise_1;

public class Box {

    private double length;
    private double width;
    private double height;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double bulk() {
        return this.height * this.width * this.length;
    }

    public String status() {
        return "the height: " + this.height + " the width: " + this.width + " the length: " + this.length;
    }

    public Box() {
        this.height = 0;
        this.length = 0;
        this.width = 0;
    }

    public Box(double height, double length, double width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public Box(Box box) {
        this.height = box.height;
        this.length = box.length;
        this.width = box.width;
    }
}
