package ru.mirea.lab8;

import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество членов последовательности (n): ");
        int n = scanner.nextInt();
        scanner.close();

        generateTriangularSequence(n);
    }

    public static void generateTriangularSequence(int n) {
        int count = 0;
        for (int i = 1; count < n; i++) {
            for (int j = 0; j < i && count < n; j++) {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}

