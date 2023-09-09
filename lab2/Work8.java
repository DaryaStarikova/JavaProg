package ru.mirea.lab2;

public class Work8 {
    public static void main (String[] args) {
        String[] array = {"a", "b", "c", "d"};

        int size = array.length;

        for (int i = 0; i < size / 2; i++) {
            String n = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = n;
        }

        for (String i : array) {
            System.out.print(i + " ");
        }
    }
}
