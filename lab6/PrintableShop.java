package ru.mirea.lab6;

class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Printing shop: " + name);
    }
}

