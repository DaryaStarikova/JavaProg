package ru.mirea.lab8;

import java.util.Random;
import java.util.Scanner;

public class Work6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n (> 1): ");
        long n = scanner.nextLong();
        scanner.close();

        boolean isPrime = isPrimeMillerRabin(n, 5);  // Проводим 5 тестов
        System.out.println(isPrime ? "YES" : "NO");
    }

    public static boolean isPrimeMillerRabin(long n, int k) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        long d = n - 1;
        int r = 0;
        while (d % 2 == 0) {
            d /= 2;
            r++;
        }

        Random random = new Random();

        for (int i = 0; i < k; i++) {
            long a = 2 + random.nextInt((int) (n - 2));  // Генерируем случайное a: 2 <= a <= n-2
            long x = powerMod(a, d, n);

            if (x == 1 || x == n - 1) {
                continue;
            }

            boolean isWitness = true;
            for (int j = 0; j < r - 1; j++) {
                x = powerMod(x, 2, n);
                if (x == n - 1) {
                    isWitness = false;
                    break;
                }
            }

            if (isWitness) {
                return false;
            }
        }

        return true;
    }

    private static long powerMod(long base, long exp, long mod) {
        long result = 1;
        base = base % mod;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }

            exp = exp >> 1; // equivalent to exp /= 2
            base = (base * base) % mod;
        }

        return result;
    }
}

