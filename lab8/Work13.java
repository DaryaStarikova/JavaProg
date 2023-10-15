package ru.mirea.lab8;

import java.util.Scanner;

public class Work13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printElementsWithOddIndices(scanner);
    }

    public static void printElementsWithOddIndices(Scanner scanner) {
        int number = scanner.nextInt();

        // Базовый случай: если число 0, завершаем рекурсию
        if (number == 0) {
            return;
        }

        // Рекурсивно вызываем функцию для оставшейся части последовательности
        if (number % 2 != 0) {
            System.out.println(number);
        }

        // Считываем и пропускаем следующее число
        scanner.nextInt();

        // Рекурсивно вызываем функцию для оставшейся части последовательности
        printElementsWithOddIndices(scanner);
    }
}

