package com.codegnan.oopsassignments;

class Product {
    String name;
    double price;
    int quantity;

    Product(String n, double p, int q) {
        if (p <= 0) {
            System.out.println("Error: Price must be positive");
        } else if (q < 0) {
            System.out.println("Error: Quantity must be non-negative");
        } else {
            name = n;
            price = p;
            quantity = q;
            System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 999.99, 5);
    }
}
