package ru.mirea.lab2;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");

        String input = scanner.nextLine(); // Считываем введенную строку
        String[] words = input.split("\\s+"); // Разбиваем строку на слова, используя пробелы как разделители

        int wordCount = words.length; // Получаем количество слов

        System.out.println("Количество слов в введенном тексте: " + wordCount);

        scanner.close();
    }
}
