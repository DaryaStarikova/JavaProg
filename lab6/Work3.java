package ru.mirea.lab6;

interface Nameable {
    String getName();
}

class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Car implements Nameable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}

class Animal implements Nameable {
    private String species;

    public Animal(String species) {
        this.species = species;
    }

    @Override
    public String getName() {
        return species;
    }
}

public class Work3 {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth");
        Car car = new Car("Toyota");
        Animal lion = new Animal("Lion");

        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + car.getName());
        System.out.println("Animal name: " + lion.getName());
    }
}

