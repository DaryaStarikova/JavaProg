package ru.mirea.lab3;

import java.util.Random;
import java.util.Scanner;

public class MRwork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Пожалуйста, введите натуральное число больше 0: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        // Массив из n элементов
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        System.out.println("Исходный массив:");
        printArray(array);

        // Массив из четных элементов
        int[] evenArray = createEvenArray(array);

        System.out.println("\nМассив из четных элементов:");
        printArray(evenArray);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] createEvenArray(int[] arr) {
        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArray[index] = num;
                index++;
            }
        }

        return evenArray;
    }
}
