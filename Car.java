package com.codegnan.oopsassignments;

class Car {
    String brand;
    String model;
    double price;

    Car(String b, String m, double p) {
        if (p <= 0) {
            System.out.println("Error: Rental price must be positive");
        } else {
            brand = b;
            model = m;
            price = p;
            System.out.println("Brand: " + brand + ", Model: " + model + ", Price per Day: " + price);
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 50.0);
    }
}
