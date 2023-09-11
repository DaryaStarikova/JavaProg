package ru.mirea.lab3;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }
}

class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Отчет о сотрудниках:");

        // Заголовок таблицы
        System.out.printf("%-20s %-10s%n", "Имя сотрудника", "   Зарплата");

        for (Employee employee : employees) {
            // Форматируем строку для вывода информации о сотруднике
            String formatted = String.format("%-20s %10.2f", employee.getFullname(), employee.getSalary());
            System.out.println(formatted);
        }
    }
}