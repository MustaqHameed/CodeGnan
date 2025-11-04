package com.codegnan.oopsassignments;

class Flight {
    String number;
    String destination;
    double fare;

    Flight(String n, String d, double f) {
        if (f <= 0) {
            System.out.println("Error: Fare must be positive");
        } else {
            number = n;
            destination = d;
            fare = f;
            System.out.println("Flight: " + number + ", Destination: " + destination + ", Fare: " + fare);
        }
    }

    public static void main(String[] args) {
        Flight f1 = new Flight("AA123", "New York", 250.0);
    }
}
