package ru.mirea.lab2;

public class TestDog {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];

        dogs[0] = new Dog("Sharik", 2);
        dogs[1] = new Dog("Bobik", 7);

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }

        for (Dog dog : dogs) {
            dog.HumanAge();
        }
    }
}
