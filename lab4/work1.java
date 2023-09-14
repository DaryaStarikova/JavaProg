package ru.mirea.lab4;

// Создаем перечисление с названиями времен года
enum Season {
    Весна("прохладное", "Холодное время года"),
    Лето("жаркое", "Теплое время года"),
    Осень("прохладное", "Холодное время года"),
    Зима("холодное", "Холодное время года");

    private String средняяТемпература;
    private String описание;

    // Конструктор, принимающий среднюю температуру
    Season(String средняяТемпература, String описание) {
        this.средняяТемпература = средняяТемпература;
        this.описание = описание;
    }

    // Метод для получения средней температуры
    public String getСредняяТемпература() {
        return средняяТемпература;
    }

    // Метод для получения описания времени года
    public String getDescription() {
        return описание;
    }
}

public class work1 {
    public static void main(String[] args) {
        // Создаем переменную с любимым временем года
        Season favoriteSeason = Season.Лето;

        // Выводим информацию о любимом времени года
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getСредняяТемпература());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // Вызываем метод с оператором switch
        printSeasonDescription(Season.Лето);

        // Выводим информацию о всех временах года
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getСредняяТемпература());
            System.out.println("Описание: " + season.getDescription());
        }
    }

    // Метод с оператором switch для вывода описания времени года
    public static void printSeasonDescription(Season season) {
        switch (season) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Осень:
                System.out.println("Я люблю осень");
                break;
            case Зима:
                System.out.println("Я люблю зиму");
                break;
            case Весна:
                System.out.println("Я люблю весну");
                break;
            default:
                System.out.println("Неизвестное время года");
        }
    }
}

