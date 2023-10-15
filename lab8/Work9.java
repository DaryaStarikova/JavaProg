package ru.mirea.lab8;

import java.util.Scanner;

public class Work9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество нулей (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите количество единиц (b): ");
        int b = scanner.nextInt();
        scanner.close();

        long result = countSequences(a, b);
        System.out.println("Количество последовательностей: " + result);
    }

    public static long countSequences(int a, int b) {
        if (a < 0 || b < 0) {
            return 0;
        }

        // Инициализация массива для хранения количества последовательностей
        long[][] dp = new long[a + 1][b + 1];

        // Изначально, для 0 нулей и 0 единиц существует 1 последовательность
        dp[0][0] = 1;

        // Заполнение массива dp по формуле
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                if (i > 0) {
                    dp[i][j] += dp[i - 1][j];
                }
                if (j > 0 && i < a) {
                    dp[i][j] += dp[i][j - 1];
                }
            }
        }

        return dp[a][b];
    }
}

