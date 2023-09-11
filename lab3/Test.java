package ru.mirea.lab3;

import java.util.Arrays;

public class Test {
    protected Circle[] circles;
    private int count;

    public Test(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив окружностей уже заполнен.");
        }
    }

    public void findSmallestCircle() {
        if (count == 0) {
            System.out.println("Массив окружностей пуст.");
            return;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }

        System.out.println("Самая маленькая окружность:");
        System.out.println("Центр: (" + smallestCircle.getCenter().getX() + ", " + smallestCircle.getCenter().getY() + ")");
        System.out.println("Радиус: " + smallestCircle.getRadius());
        System.out.println("Длина окружности: " + smallestCircle.getLength());
    }

    public void findLargestCircle() {
        if (count == 0) {
            System.out.println("Массив окружностей пуст.");
            return;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }

        System.out.println("Самая большая окружность:");
        System.out.println("Центр: (" + largestCircle.getCenter().getX() + ", " + largestCircle.getCenter().getY() + ")");
        System.out.println("Радиус: " + largestCircle.getRadius());
        System.out.println("Длина окружности: " + largestCircle.getLength());
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, count, (circle1, circle2) -> {
            double radius1 = circle1.getRadius();
            double radius2 = circle2.getRadius();
            return Double.compare(radius1, radius2);
        });
    }

}
