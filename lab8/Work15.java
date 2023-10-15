package ru.mirea.lab8;

import java.util.Scanner;

public class Work15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();
        scanner.close();

        printDigitsReverse(N);
    }

    public static void printDigitsReverse(int N) {
        if (N == 0) {
            return;
        }

        int lastDigit = N % 10;  // Получаем последнюю цифру числа
        int remainingDigits = N / 10;  // Оставшиеся цифры числа

        // Выводим последнюю цифру
        System.out.print(lastDigit + " ");

        // Рекурсивно вызываем функцию для оставшихся цифр числа
        printDigitsReverse(remainingDigits);
    }
}

