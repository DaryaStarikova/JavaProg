package ru.mirea.lab8;

import java.util.Scanner;

public class Work8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine().toLowerCase(); // Преобразуем все буквы в нижний регистр
        scanner.close();

        boolean isPalindrome = isPalindrome(word);
        if (isPalindrome) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String word) {
        // Базовый случай: если длина слова меньше или равна 1, то это палиндром
        if (word.length() <= 1) {
            return true;
        }

        // Сравниваем первую и последнюю букву
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        // Рекурсивно проверяем оставшуюся часть слова без первой и последней буквы
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}
