package ru.mirea.lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineStore {
    private Map<String, Double> exchangeRates;
    private Map<String, Double> products;
    private Scanner scanner;

    public OnlineStore() {
        // Здесь мы создаем фиктивные обменные курсы для демонстрации.
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0); // 1 USD = 1 USD
        exchangeRates.put("EUR", 0.85); // 1 USD = 0.85 EUR
        exchangeRates.put("GBP", 0.75); // 1 USD = 0.75 GBP

        // Здесь мы создаем фиктивные товары с их ценами.
        products = new HashMap<>();
        products.put("Товар 1", 10.0);
        products.put("Товар 2", 20.0);
        products.put("Товар 3", 30.0);

        scanner = new Scanner(System.in); // Инициализируем Scanner в конструкторе
    }

    public double convertToUSD(String currency, double amount) {
        if (exchangeRates.containsKey(currency)) {
            double rate = exchangeRates.get(currency);
            return amount / rate;
        } else {
            System.out.println("Курс для выбранной валюты не найден.");
            return -1.0;
        }
    }

    public void displayProducts() {
        System.out.println("Доступные товары:");
        for (String productName : products.keySet()) {
            double priceUSD = products.get(productName);
            System.out.println(productName + ": " + priceUSD + " USD");
        }
    }

    public void purchaseProduct(String productName, double amount, String currency) {
        if (products.containsKey(productName)) {
            while (amount <= 0) {
                System.out.println("Введите корректное количество товаров (больше 0): ");
                amount = scanner.nextDouble();
            }

            double priceUSD = products.get(productName);
            double priceInSelectedCurrency = convertToUSD(currency, priceUSD * amount);

            if (priceInSelectedCurrency >= 0) {
                System.out.println("Вы купили " + productName + " (" + amount + " штук) за " + priceInSelectedCurrency + " " + currency);
            }
        } else {
            System.out.println("Товар не найден.");
        }
    }

    public static void main(String[] args) {
        OnlineStore store = new OnlineStore();

        System.out.println("Добро пожаловать в интернет-магазин!");

        while (true) {
            store.displayProducts();

            System.out.print("Выберите товар (или 'exit' для выхода): ");
            String productName = store.scanner.nextLine();

            if (productName.equalsIgnoreCase("exit")) {
                break;
            }

            if (store.products.containsKey(productName)) {
                System.out.print("Введите количество: ");
                double amount = store.scanner.nextDouble();
                store.scanner.nextLine(); // Перевод строки после считывания числа

                System.out.print("Выберите валюту (USD, EUR, GBP): ");
                String currency = store.scanner.nextLine().toUpperCase();

                store.purchaseProduct(productName, amount, currency);
            } else {
                System.out.println("Товар не найден.");
            }
        }

        System.out.println("Спасибо за покупки!");
    }
}
