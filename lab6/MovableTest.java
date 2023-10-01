package ru.mirea.lab6;

public class MovableTest {
    public static void main(String[] args) {
        // Создаем объекты MovablePoint и MovableCircle
        MovablePoint movablePoint = new MovablePoint(10, 20, 2, 3);
        MovableCircle movableCircle = new MovableCircle(30, 40, 1, 1, 5);

        // Демонстрируем движение
        System.out.println("Before moving:");
        System.out.println(movablePoint.toString());
        System.out.println(movableCircle.toString());

        movablePoint.moveUp();
        movableCircle.moveDown();

        System.out.println("\nAfter moving:");
        System.out.println(movablePoint.toString());
        System.out.println(movableCircle.toString());
    }
}