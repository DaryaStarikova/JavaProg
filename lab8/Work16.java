package ru.mirea.lab8;

import java.util.Scanner;

public class Work16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность натуральных чисел, завершающуюся 0:");
        int count = countMaxElements();
        System.out.println("Количество элементов, равных максимуму: " + count);
    }

    public static int countMaxElements() {
        return countMaxElementsHelper(0, Integer.MIN_VALUE);
    }

    private static int countMaxElementsHelper(int count, int max) {
        int number = new Scanner(System.in).nextInt();

        if (number == 0)
            return count;

        if (number > max) {
            return countMaxElementsHelper(1, number);
        } else if (number == max) {
            return countMaxElementsHelper(count + 1, max);
        } else {
            return countMaxElementsHelper(count, max);
        }
    }
}

