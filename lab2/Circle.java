package ru.mirea.lab2;

public class Circle {
    private double rad;
    private Point center;

    public Circle(Point center, double radius) {
        this.center = center;
        this.rad = radius;
    }

    public double getRadius() {
        return rad;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.rad = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
}
