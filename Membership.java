package com.codegnan.oopsassignments;

class Membership {
    String name;
    String plan;
    double fee;

    Membership(String n, String p, double f) {
        if (f <= 0) {
            System.out.println("Error: Fee must be positive");
        } else {
            name = n;
            plan = p;
            fee = f;
            System.out.println("Member: " + name + ", Plan: " + plan + ", Fee: " + fee);
        }
    }

    public static void main(String[] args) {
        Membership m1 = new Membership("Tom Wilson", "Premium", 50.0);
    }
}
