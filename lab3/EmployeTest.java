package ru.mirea.lab3;

public class EmployeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Иван Иванов", 2500.50);
        employees[1] = new Employee("Петр Петров", 3200.75);
        employees[2] = new Employee("Мария Сидорова", 2800.25);

        Report.generateReport(employees);
    }
}
