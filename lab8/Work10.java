package ru.mirea.lab8;

import java.util.Scanner;

public class Work10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();
        scanner.close();

        int reversedNumber = reverseNumber(n);
        System.out.println("Развёрнутое число: " + reversedNumber);
    }

    public static int reverseNumber(int n) {
        return reverseNumberHelper(n, 0);
    }

    private static int reverseNumberHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }

        int lastDigit = n % 10;  // Получаем последнюю цифру числа
        int remainingDigits = n / 10;  // Оставшиеся цифры числа

        // Рекурсивно вызываем функцию для оставшихся цифр числа и разворачиваем число
        return reverseNumberHelper(remainingDigits, reversed * 10 + lastDigit);
    }
}

