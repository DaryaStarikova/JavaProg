package ru.mirea.lab6;

interface Priceable {
    double getPrice();
}

class Product implements Priceable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - Price: $" + getPrice();
    }
}

class Service implements Priceable {
    private String serviceName;
    private double hourlyRate;

    public Service(String serviceName, double hourlyRate) {
        this.serviceName = serviceName;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getPrice() {
        // For simplicity, we'll assume a fixed duration of 1 hour for the service.
        return hourlyRate;
    }

    @Override
    public String toString() {
        return serviceName + " - Hourly Rate: $" + getPrice();
    }
}

public class Work4 {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200.0);
        Service consultingService = new Service("Consulting Service", 75.0);

        System.out.println(laptop);
        System.out.println(consultingService);
    }
}
