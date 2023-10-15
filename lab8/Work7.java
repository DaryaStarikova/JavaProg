package ru.mirea.lab8;

import java.util.Scanner;

public class Work7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n (> 1): ");
        int n = scanner.nextInt();
        scanner.close();

        factorize(n);
    }

    public static void factorize(int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                int count = 0;
                while (n % i == 0) {
                    count++;
                    n /= i;
                }
                for (int j = 0; j < count; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

