package ru.mirea.lab1;

public class work14 {
    public static void main (String[] args){
        int n = 10; // Количество элементов ряда

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            double harmonicNumber = 1.0 / i; // Вычисляем элемент ряда

            // Выводим элемент ряда с форматированием
            System.out.printf("Число %d: %.4f%n", i, harmonicNumber);
        }
    }
}
