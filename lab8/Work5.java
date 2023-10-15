package ru.mirea.lab8;

import java.util.Scanner;

public class Work5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число N: ");
        int N = scanner.nextInt();
        scanner.close();

        int sumOfDigits = calculateSumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна: " + sumOfDigits);
    }

    public static int calculateSumOfDigits(int N) {
        if (N == 0) {
            return 0;  // Базовый случай: сумма для числа 0 равна 0
        }

        int lastDigit = N % 10;  // Получаем последнюю цифру числа
        int remainingDigits = N / 10;  // Оставшиеся цифры числа

        // Рекурсивно вызываем функцию для оставшихся цифр числа и суммируем с последней цифрой
        return lastDigit + calculateSumOfDigits(remainingDigits);
    }
}

