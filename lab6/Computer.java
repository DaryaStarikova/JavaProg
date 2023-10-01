package ru.mirea.lab6;

enum Brand {
    HP, Dell, Lenovo, Asus, Acer
}

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}

class Memory {
    private int sizeGB;

    public Memory(int sizeGB) {
        this.sizeGB = sizeGB;
    }

    @Override
    public String toString() {
        return sizeGB + " GB";
    }
}

class Monitor {
    private String model;
    private int sizeInches;

    public Monitor(String model, int sizeInches) {
        this.model = model;
        this.sizeInches = sizeInches;
    }

    @Override
    public String toString() {
        return model + " (" + sizeInches + " inches)";
    }
}
public class Computer {
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

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Computer [Brand: " + brand + ", Processor: " + processor + ", Memory: " + memory + ", Monitor: " + monitor + "]";
    }
}