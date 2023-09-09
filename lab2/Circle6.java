package ru.mirea.lab2;

public class Circle6 {
    private double r;

    public Circle6(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR (double r) {
        this.r = r;
    }

    public double S() {
        return Math.PI * r * r;
    }

    public double length() {
        return 2 * Math.PI * r;
    }

    public boolean equals(Circle6 circle) {
        return this.r == circle.r;
    }
}
