package ru.mirea.lab2;

public class TestCircle {
    public static void main(String[] args) {
        Circle6 c1 = new Circle6(8.6);
        Circle6 c2 = new Circle6(4.2);

        System.out.println("1th circle: area - " + c1.S() + ", length - " + c1.length());
        System.out.println("2nd circle: area - " + c2.S() + ", length - " + c2.length());

        if (c1.equals(c2)) {
            System.out.println("1-th circle = 2-nd circle");
        }
        else {
            System.out.println("1-th circle not = 2-nd circle");
        }
    }
}
