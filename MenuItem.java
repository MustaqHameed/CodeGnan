package com.codegnan.oopsassignments;

class MenuItem {
    String name;
    double price;
    String category;

    MenuItem(String n, double p, String c) {
        if (p <= 0) {
            System.out.println("Error: Price must be positive");
        } else {
            name = n;
            price = p;
            category = c;
            System.out.println("Item: " + name + ", Price: " + price + ", Category: " + category);
        }
    }

    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("Spring Rolls", 5.99, "Appetizer");
    }
}
