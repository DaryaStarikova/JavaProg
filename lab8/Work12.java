package ru.mirea.lab8;

import java.util.Scanner;

public class Work12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOddNumbersInSequence(scanner);
    }

    public static void printOddNumbersInSequence(Scanner scanner) {
        int number = scanner.nextInt();

        // Базовый случай: если число 0, завершаем рекурсию
        if (number == 0) {
            return;
        }

        // Рекурсивно вызываем функцию для оставшейся части последовательности
        if (number % 2 != 0) {
            System.out.println(number);
        }
        printOddNumbersInSequence(scanner);
    }
}

