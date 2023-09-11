package ru.mirea.lab3;

import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {
    private Map<String, Double> exchangeRates;

    public CurrencyConverter() {
        // Здесь мы создаем фиктивные обменные курсы для демонстрации.
        exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0); // 1 USD = 1 USD
        exchangeRates.put("EUR", 0.85); // 1 USD = 0.85 EUR
        exchangeRates.put("GBP", 0.75); // 1 USD = 0.75 GBP
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (exchangeRates.containsKey(fromCurrency) && exchangeRates.containsKey(toCurrency)) {
            double rateFrom = exchangeRates.get(fromCurrency);
            double rateTo = exchangeRates.get(toCurrency);

            // Выполняем конвертацию
            return (amount / rateFrom) * rateTo;
        } else {
            System.out.println("Один из кодов валют не найден.");
            return -1.0; // Возвращаем -1, чтобы обозначить ошибку.
        }
    }

    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();

        String fromCurrency = "USD";
        String toCurrency = "EUR";
        double amount = 100.0;

        double convertedAmount = converter.convert(fromCurrency, toCurrency, amount);

        if (convertedAmount >= 0) {
            System.out.println(amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
        }
    }
}
