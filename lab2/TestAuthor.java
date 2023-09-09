package ru.mirea.lab2;
import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Darya", "daryasstar@yandex.ru", 'f');

        System.out.println("Name: " + a1.getName());
        System.out.println("Email: " + a1.getEmail());
        System.out.println("Gender: " + a1.getGender());

        a1.setEmail("newemailfordaryasstar@yandex.ru");

        System.out.println("New email: " + a1.getEmail());

        System.out.println("Info: " + a1.toString());

    }
}