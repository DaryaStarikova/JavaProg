package ru.mirea.lab8;

import java.util.Scanner;

public class Work14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();
        scanner.close();

        printDigits(N);
    }

    public static void printDigits(int N) {
        if (N == 0) {
            return;
        }

        int lastDigit = N % 10;  // Получаем последнюю цифру числа
        int remainingDigits = N / 10;  // Оставшиеся цифры числа

        // Рекурсивно вызываем функцию для оставшихся цифр числа
        printDigits(remainingDigits);

        // Выводим последнюю цифру
        System.out.print(lastDigit + " ");
    }
}

