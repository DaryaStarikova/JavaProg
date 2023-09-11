package ru.mirea.lab3;

import java.util.Random;

public class MRwork2 {
    public static void main(String[] args) {
        int numberOfCircles = 5; // Количество окружностей

        Test tester = new Test(numberOfCircles);

        Random random = new Random();

        for (int i = 0; i < numberOfCircles; i++) {
            double x = random.nextDouble() * 10; // Генерируем случайные координаты x
            double y = random.nextDouble() * 10; // Генерируем случайные координаты y
            double radius = random.nextDouble() * 5; // Генерируем случайный радиус

            Point center = new Point(x, y);
            Circle circle = new Circle(center, radius);

            tester.addCircle(circle);
        }

        tester.findSmallestCircle();
        tester.findLargestCircle();

        tester.sortCirclesByRadius();

        System.out.println("\nОтсортированные окружности по радиусу:");
        for (int i = 0; i < numberOfCircles; i++) {
            Circle circle = tester.circles[i];
            System.out.println("Радиус: " + circle.getRadius() + ", Длина окружности: " + circle.getLength());
        }
    }
}
