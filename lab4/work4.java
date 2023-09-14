package ru.mirea.lab4;

// Перечисление для марок компьютера
enum Brand {
    HP,
    Dell,
    Lenovo,
    Asus,
    Acer
}

// Класс процессор
class Processor {
    private String model;
    private double clockSpeed;

    public Processor(String model, double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

}

// Класс оперативной памяти
class Memory {
    private int capacity;
    private String type;

    public Memory(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    /*public void upgrade(int additionalCapacity) {
        //Метод для увеличения объема памяти
        capacity += additionalCapacity;
    }*/
}

// Класс монитор
class Monitor {
    private String model;
    private double screenSize; // в дюймах

    public Monitor(String model, double screenSize) {
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }
}

// Класс компьютер
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

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    /*public void powerOn() {
        // Реализация метода для включения компьютера
    }

    public void powerOff() {
        // Реализация метода для выключения компьютера
    }*/

    public void printComputerInfo() {
        System.out.println("Марка компьютера: " + brand);
        System.out.println("Процессор: " + processor.getModel() + " (Частота: " + processor.getClockSpeed() + " ГГц)");
        System.out.println("Оперативная память: " + memory.getCapacity() + " ГБ " + memory.getType());
        System.out.println("Монитор: " + monitor.getModel() + " (Размер экрана: " + monitor.getScreenSize() + " дюймов)");
    }
}

public class work4 {
    public static void main(String[] args) {
        // Создание объектов для компьютера и его компонентов
        Processor processor = new Processor("Intel Core i7", 3.4);
        Memory memory = new Memory(16, "DDR4");
        Monitor monitor = new Monitor("Dell Ultrasharp U2719D", 27.0);
        Computer computer = new Computer(Brand.Dell, processor, memory, monitor);

        // Вывод информации о компьютере
        computer.printComputerInfo();
    }
}
