package ru.mirea.lab8;

import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество цифр (k): ");
        int k = scanner.nextInt();
        System.out.print("Введите сумму цифр (s): ");
        int s = scanner.nextInt();
        scanner.close();

        int count = countNumbersWithGivenSum(k, s);
        System.out.println("Количество " + k + "-значных натуральных чисел с суммой цифр " + s + " : " + count);
    }

    public static int countNumbersWithGivenSum(int k, int s) {
        return countNumbersWithGivenSumHelper(k, s, 0, 0);
    }

    private static int countNumbersWithGivenSumHelper(int k, int s, int currentSum, int currentPosition) {
        if (currentPosition == k) {
            return currentSum == s ? 1 : 0;
        }

        int count = 0;
        int startDigit = (currentPosition == 0) ? 1 : 0;  // Не начинать с 0, если это первая позиция

        for (int digit = startDigit; digit <= 9; digit++) {
            count += countNumbersWithGivenSumHelper(k, s, currentSum + digit, currentPosition + 1);
        }

        return count;
    }
}

