package ru.mirea.lab3;

import java.util.Random;
import java.util.Arrays;
import java.text.DecimalFormat;

public class MRwork1 {
    public static void main(String[] args) {
        int size = 10;
        double[] RandArray = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            RandArray[i] = random.nextDouble() * 100;
        }
        System.out.println("Array class random: ");
        printArrayWithFormat(RandArray);

        Arrays.sort(RandArray);
        System.out.println("Sort array class random: ");
        printArrayWithFormat(RandArray);

        double[] RandArray2 = new double[size];
        for (int i = 0; i < size; i++){
            RandArray2[i] = Math.random() * 100;
        }
        System.out.println("\nArray Math.random: ");
        printArrayWithFormat(RandArray2);

        Arrays.sort(RandArray2);
        System.out.println("Sort array Math.random: ");
        printArrayWithFormat(RandArray);
    }
    public static void printArrayWithFormat(double[] arr) {
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
        for (double num : arr) {
            System.out.print(decimalFormat.format(num) + " ");
        }
        System.out.println();
    }
}
