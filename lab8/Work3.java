package ru.mirea.lab8;

import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int B = scanner.nextInt();
        scanner.close();

        if (A < B) {
            printAscending(A, B);
        } else {
            printDescending(A, B);
        }
    }

    public static void printAscending(int A, int B) {
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }
    }

    public static void printDescending(int A, int B) {
        for (int i = A; i >= B; i--) {
            System.out.print(i + " ");
        }
    }
}

