package ru.mirea.lab8;

import java.util.Scanner;

public class Work17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность натуральных чисел, завершающуюся 0:");
        int max = findMax();
        System.out.println("Наибольшее значение в последовательности: " + max);
    }

    public static int findMax() {
        int number = new Scanner(System.in).nextInt();

        if (number == 0) {
            return Integer.MIN_VALUE; // Возвращаем минимальное значение в случае завершения последовательности
        }

        int maxInRest = findMax();  // Рекурсивный вызов для оставшейся части последовательности

        // Сравниваем текущее число с максимумом в оставшейся части и возвращаем большее
        return Math.max(number, maxInRest);
    }
}

