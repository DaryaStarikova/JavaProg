package ru.mirea.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PockerJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        List<String> deck = createDeck();
        Collections.shuffle(deck); //Перетасовка карт

        int cardsPerPlayer = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                String card = deck.remove(0);
                System.out.println(card);
            }
            System.out.println(); //Пустая строка
        }
        scanner.close();
    }
    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Черви", "Бубны", "Трефы", "Пики"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String value : values) {
                String card = value + " " + suit;
                deck.add(card);
            }
        }

        return deck;
    }
}

