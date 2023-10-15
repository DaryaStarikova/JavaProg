package ru.mirea.lab8;

import java.util.Scanner;

public class Work11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = countOnesInSequence(scanner);
        System.out.println("Количество единиц: " + count);
    }

    public static int countOnesInSequence(Scanner scanner) {
        int number = scanner.nextInt();

        // Базовый случай: если встретили два нуля, завершаем рекурсию
        if (number == 0) {
            int nextNumber = scanner.nextInt();
            if (nextNumber == 0) {
                return 0;
            }
        }

        // Рекурсивно вызываем функцию для оставшейся части последовательности
        return (number == 1 ? 1 : 0) + countOnesInSequence(scanner);
    }
}

