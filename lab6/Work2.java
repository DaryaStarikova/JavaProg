package ru.mirea.lab6;

class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, xSpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, xSpeed);
        if (!areSpeedsEqual()) {
            throw new IllegalArgumentException("X and Y speeds must be equal for both points.");
        }
    }

    private boolean areSpeedsEqual() {
        return topLeft.getxSpeed() == topLeft.getySpeed() &&
                bottomRight.getxSpeed() == bottomRight.getySpeed() &&
                topLeft.getxSpeed() == bottomRight.getxSpeed();
    }

    public String toString() {
        return String.format("MovableRectangle: TopLeft %s, BottomRight %s", topLeft.toString(), bottomRight.toString());
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}

public class Work2 {
    public static void main(String[] args) {
        // Создаем объект MovableRectangle
        MovableRectangle movableRectangle = new MovableRectangle(10, 20, 50, 40, 2);

        // Демонстрируем движение
        System.out.println("Before moving:");
        System.out.println(movableRectangle.toString());

        movableRectangle.moveUp();
        movableRectangle.moveRight();

        System.out.println("\nAfter moving:");
        System.out.println(movableRectangle.toString());
    }
}

