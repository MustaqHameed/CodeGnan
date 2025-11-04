package com.codegnan.oopsassignments;

class Vehicle {
    String type;
    String license;
    int hours;

    Vehicle(String t, String l, int h) {
        if (h < 0) {
            System.out.println("Error: Hours parked must be non-negative");
        } else {
            type = t;
            license = l;
            hours = h;
            System.out.println("Type: " + type + ", License: " + license + ", Hours Parked: " + hours);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Car", "ABC123", 4);
    }
}
