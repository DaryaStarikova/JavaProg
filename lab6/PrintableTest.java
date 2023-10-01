package ru.mirea.lab6;

public class PrintableTest {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("Book 1"),
                new Book("Book 2"),
                new Shop("Shop A"),
                new Shop("Shop B")
        };

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
