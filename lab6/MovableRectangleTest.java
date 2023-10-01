package ru.mirea.lab6;

public class MovableRectangleTest {
    public static void main(String[] args) {
        // Создаем объект MovableRectangle
        MovableRectangle movableRectangle = new MovableRectangle(10, 20, 50, 40, 2, 2);

        // Демонстрируем движение
        System.out.println("Before moving:");
        System.out.println(movableRectangle.toString());

        movableRectangle.moveUp();
        movableRectangle.moveRight();

        System.out.println("\nAfter moving:");
        System.out.println(movableRectangle.toString());
    }
}
