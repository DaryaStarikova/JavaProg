package ru.mirea.lab6;

import java.util.ArrayList;
import java.util.Scanner;

enum Brand {
    ACER,
    ASUS,
    DELL,
    HP,
    LENOVO
}

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Processor: " + model;
    }
}

class Memory {
    private int sizeGB;

    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    public int getSizeGB() {
        return sizeGB;
    }

    @Override
    public String toString() {
        return "Memory: " + sizeGB + "GB";
    }
}

class Monitor {
    private int sizeInches;

    public Monitor(int sizeInches) {
        this.sizeInches = sizeInches;
    }

    public int getSizeInches() {
        return sizeInches;
    }

    @Override
    public String toString() {
        return "Monitor size: " + sizeInches + " inches";
    }
}

class Computer {
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public Brand getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "Brand: " + brand +
                ", " + processor +
                ", " + memory +
                ", " + monitor;
    }
}

class OnlineShop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public Computer findComputer(Brand brand) {
        for (Computer computer : computers) {
            if (computer.getBrand() == brand) {
                return computer;
            }
        }
        return null;
    }
}

public class Work10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a shop
        OnlineShop shop = new OnlineShop();

        // Input computer details from the user
        System.out.print("Enter computer brand (ACER, ASUS, DELL, HP, LENOVO): ");
        Brand brand = Brand.valueOf(scanner.nextLine());

        System.out.print("Enter processor model: ");
        Processor processor = new Processor(scanner.nextLine());

        System.out.print("Enter memory size (in GB): ");
        Memory memory = new Memory(scanner.nextInt());

        System.out.print("Enter monitor size (in inches): ");
        Monitor monitor = new Monitor(scanner.nextInt());

        // Create a computer based on the input
        Computer computer = new Computer(brand, processor, memory, monitor);

        // Add the computer to the shop
        shop.addComputer(computer);

        // Find a computer in the shop and display its details
        System.out.print("Enter a brand to search for a computer: ");
        Brand searchBrand = Brand.valueOf(scanner.next());

        Computer foundComputer = shop.findComputer(searchBrand);
        if (foundComputer != null) {
            System.out.println("Found computer:");
            System.out.println(foundComputer);
        } else {
            System.out.println("Computer not found for the specified brand.");
        }
    }
}

