package ru.mirea.lab6;

interface Printable {
    void print();
}

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing book: " + title);
    }
}

class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing shop: " + name);
    }
}

public class Work6789 {
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
