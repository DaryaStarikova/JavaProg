package ru.mirea.lab1;

import java.util.Scanner;

public class work12 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Введите размер массива: ");
        int n = scanner.nextInt();

        int array[] = new int[n];

        System.out.print ("Введите элементы массива: ");

        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }

        int sumWithDoWhile = MethodSumWithDoWhile(array);
        int sumWithWhile = MethodSumWithWhile(array);
        int maxElement = Methodmax(array);
        int minElement = Methodmin(array);

        System.out.println("Сумма элементов массива (do-while): " + sumWithDoWhile);
        System.out.println("Сумма элементов массива (while): " + sumWithWhile);
        System.out.println("Максимальный элемент массива: " + maxElement);
        System.out.println("Минимальный элемент массива: " + minElement);

    }
    public static int MethodSumWithDoWhile(int[] array) {
        int sum = 0, i = 0;
        do {
            sum += array[i];
            i++;
        } while (i < array.length);
        return sum;
    }

    public static int MethodSumWithWhile(int[] array){
        int sum = 0, i = 0;
        while (i < array.length){
            sum +=array[i];
            i++;
        }
        return sum;
    }

    public static int Methodmax (int[] array){
        int maxnum = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxnum){
                maxnum = array[i];
            }
        }
        return maxnum;
    }

    public static int Methodmin (int[] array){
        int minnum = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < minnum){
                minnum = array[i];
            }
        }
        return minnum;
    }
}