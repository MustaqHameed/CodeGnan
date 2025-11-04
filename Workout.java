package com.codegnan.oopsassignments;

class Workout {
    String name;
    int steps;
    double calories;

    Workout(String n, int s, double c) {
        if (s < 0) {
            System.out.println("Error: Steps must be non-negative");
        } else if (c < 0) {
            System.out.println("Error: Calories burned must be non-negative");
        } else {
            name = n;
            steps = s;
            calories = c;
            System.out.println("User: " + name + ", Steps: " + steps + ", Calories Burned: " + calories);
        }
    }

    public static void main(String[] args) {
        Workout w1 = new Workout("Sophie Green", 10000, 500.0);
    }
}
