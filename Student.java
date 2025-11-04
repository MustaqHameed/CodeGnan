package com.codegnan.oopsassignments;

class Student {
    String name;
    int rollNumber;
    int[] marks;

    Student() {
        name = "Unknown";
        rollNumber = 0;
        marks = new int[]{0, 0, 0};
    }

    Student(String n, int r, int[] m) {
        name = n;
        rollNumber = r;
        marks = m;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }

    int calculateTotal() {
        return marks[0] + marks[1] + marks[2];
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Mustaq", 101, new int[]{80, 90, 85});

        s1.displayDetails();
        System.out.println("Total: " + s1.calculateTotal());
        System.out.println("Average: " + s1.calculateAverage());
        System.out.println("----------------");
        s2.displayDetails();
        System.out.println("Total: " + s2.calculateTotal());
        System.out.println("Average: " + s2.calculateAverage());
    }
}
