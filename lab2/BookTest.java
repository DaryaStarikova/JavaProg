package ru.mirea.lab2;

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("A. S. Pushkin", "Captain's daughter", 1836);
        Book b2 = new Book("N. V. Gogol", "Dead Souls", 1842);

        b1.setName("GoodBook");
        System.out.println("Name 1-th book (update) - " + b1.getName());

        b2.setYear(1980);
        System.out.println("Year 2-nd book (update) - " + b2.getYear());
    }
}
