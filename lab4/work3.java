package ru.mirea.lab4;

import java.util.*;

enum Catalog {
    CLOTHING,
    ELECTRONICS,
    BOOKS
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class User {
    private String username;
    private String password;
    private List<Product> cart;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    //Проверка аутентификации
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Cart contents:");
            for (Product product : cart) {
                System.out.println(product.getName() + " - $" + product.getPrice());
            }
        }
    }

    public void checkout() {
        double total = 0;
        System.out.println("Receipt:");
        for (Product product : cart) {
            System.out.println(product.getName() + " - $" + product.getPrice());
            total += product.getPrice();
        }
        System.out.println("Total: $" + total);
        cart.clear();
    }
}

public class work3 {
    public static void main(String[] args) {
        // Создаем список товаров и каталогов
        List<Product> products = new ArrayList<>();
        products.add(new Product("T-Shirt", 19.99));
        products.add(new Product("Laptop", 799.99));
        products.add(new Product("Book", 9.99));

        // Создаем пользователя
        User user = new User("username", "password");

        // Аутентификация пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (user.authenticate(username, password)) {
            System.out.println("Authentication successful.");
            boolean running = true;
            while (running) {
                System.out.println("\nSelect an option:");
                System.out.println("1. View catalogs");
                System.out.println("2. View products in a catalog");
                System.out.println("3. Add a product to cart");
                System.out.println("4. View cart");
                System.out.println("5. Checkout");
                System.out.println("6. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Available catalogs: " + Arrays.toString(Catalog.values()));
                        break;
                    case 2:
                        System.out.print("Enter catalog name: ");
                        String catalogName = scanner.nextLine();
                        Catalog selectedCatalog = Catalog.valueOf(catalogName.toUpperCase());
                        System.out.println("Products in " + selectedCatalog + " catalog:");
                        for (Product product : products) {
                            if (selectedCatalog == Catalog.CLOTHING && product.getName().equalsIgnoreCase("T-Shirt")) {
                                System.out.println(product.getName() + " - $" + product.getPrice());
                            } else if (selectedCatalog == Catalog.ELECTRONICS && product.getName().equalsIgnoreCase("Laptop")) {
                                System.out.println(product.getName() + " - $" + product.getPrice());
                            } else if (selectedCatalog == Catalog.BOOKS && product.getName().equalsIgnoreCase("Book")) {
                                System.out.println(product.getName() + " - $" + product.getPrice());
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Enter product name to add to cart: ");
                        String productName = scanner.nextLine();
                        for (Product product : products) {
                            if (product.getName().equalsIgnoreCase(productName)) {
                                user.addToCart(product);
                                System.out.println(product.getName() + " added to cart.");
                                break;
                            }
                        }
                        break;
                    case 4:
                        user.viewCart();
                        break;
                    case 5:
                        user.checkout();
                        System.out.println("Thank you for your purchase!");
                        break;
                    case 6:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please select a valid option.");
                }
            }
        } else {
            System.out.println("Authentication failed. Exiting...");
        }
    }
}

