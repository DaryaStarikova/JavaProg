package ru.mirea.lab3;

public class ObWork1 {
    public static void main(String[] args) {
        //Создание объектов класса Double, используя метод valueOf()
        Double doubleObj1 = Double.valueOf(10.5);
        Double doubleObj2 = Double.valueOf(20.3);

        //Преобразование значения типа String к типу double
        String strValue = "30.7";
        double doubleValue = Double.parseDouble(strValue);

        //Преобразование объектов класса Double к примитивным типам
        double primitiveDouble1 = doubleObj1;
        double primitiveDouble2 = doubleObj2;

        //Вывод значений объектов Double
        System.out.println("doubleObj1: " + doubleObj1);
        System.out.println("doubleObj2: " + doubleObj2);

        //Преобразование литерала типа double к строке
        String d = Double.toString(45.9);
        System.out.println("d: " + d);

        //Вывод преобразованного значения типа double
        System.out.println("doubleValue: " + doubleValue);

        //Вывод преобразованных примитивных значений
        System.out.println("primitiveDouble1: " + primitiveDouble1);
        System.out.println("primitiveDouble2: " + primitiveDouble2);
    }
}
