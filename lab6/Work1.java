package ru.mirea.lab6;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public String toString() {
        return String.format("MovablePoint: (%d, %d)", x, y);
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return String.format("MovableCircle: Center %s, Radius %d", center.toString(), radius);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}

public class Work1 {
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

