package ru.mirea.lab1;

import java.util.Scanner;

public class work15 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        int factorial = MethodFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }
    public static int MethodFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определен только для неотрицательных целых чисел.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}