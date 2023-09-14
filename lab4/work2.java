package ru.mirea.lab4;


// Создаем перечисление с размерами одежды
enum Size {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);

    private int euroSize;

    // Конструктор, принимающий на вход euroSize
    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    // Метод для получения euroSize
    public int getEuroSize() {
        return euroSize;
    }

    // Переопределяем метод getDescription
    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }
}

// Интерфейс для мужской одежды
interface MenClothing {
    void dressMan();
    Size getSize();
    double getCost();
    String getColor();
}

// Интерфейс для женской одежды
interface WomenClothing {
    void dressWomen();
    Size getSize();
    double getCost();
    String getColor();
}

//Класс для одежды
class Clothes {
    private Size size;
    private double cost;
    private String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
}

// Класс футболки
class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в футболку");
    }
}

// Класс штаны
class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в штаны");
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в штаны");
    }
}

// Класс юбка
class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женщина одета в юбку");
    }
}

// Класс галстук
class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в галстук");
    }
}

// Класс Ателье
class Atelier {
    public static void dressWomen(Object[] clothes) {
        System.out.println("Одежда для женщин:");
        for (Object item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) item;
                womenClothing.dressWomen();
                System.out.println("Размер: " + womenClothing.getSize().getDescription());
                System.out.println("Цена: " + womenClothing.getCost());
                System.out.println("Цвет: " + womenClothing.getColor());
                System.out.println();
            }
        }
    }

    public static void dressMan(Object[] clothes) {
        System.out.println("Одежда для мужчин:");
        for (Object item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) item;
                menClothing.dressMan();
                System.out.println("Размер: " + menClothing.getSize().getDescription());
                System.out.println("Цена: " + menClothing.getCost());
                System.out.println("Цвет: " + menClothing.getColor());
                System.out.println();
            }
        }
    }
}


public class work2 {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt(Size.M, 25.99, "Синий");
        Pants pants = new Pants(Size.L, 39.99, "Черный");
        Skirt skirt = new Skirt(Size.S, 29.99, "Красный");
        Tie tie = new Tie(Size.XS, 14.99, "Серый");

        WomenClothing[] womenClothes = {tShirt, skirt};
        MenClothing[] menClothes = {tShirt, pants, tie};

        Atelier.dressWomen(womenClothes);
        System.out.println("-------------------------");
        Atelier.dressMan(menClothes);
    }
}