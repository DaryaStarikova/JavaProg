package ru.mirea.lab11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date birthDate; // Поле для даты рождения

    public Student(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    // Метод для получения строкового представления даты рождения в различных форматах
    public String getFormattedBirthDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\nВозраст: " + age + "\nДата рождения: " + getFormattedBirthDate("dd.MM.yyyy");
    }

    public static void main(String[] args) {
        // Пример использования
        Date birthDate = new Date(2000, 5, 15); // Замените эту дату на фактическую дату рождения
        Student student = new Student("Иван", 21, birthDate);

        System.out.println(student);
        System.out.println("Дата рождения в полном формате: " + student.getFormattedBirthDate("dd MMMM yyyy"));
        System.out.println("Дата рождения в коротком формате: " + student.getFormattedBirthDate("dd.MM.yy"));
    }
}

