package com.codegnan.oopsassignments;

class StudentReg {
    String name;
    int roll;
    int grade;

    StudentReg(String n, int r, int g) {
        if (r <= 0) {
            System.out.println("Error: Roll number must be positive");
        } else if (g < 1 || g > 12) {
            System.out.println("Error: Grade level must be between 1 and 12");
        } else {
            name = n;
            roll = r;
            grade = g;
            System.out.println("Name: " + name + ", Roll Number: " + roll + ", Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        StudentReg s1 = new StudentReg("Alice Brown", 101, 10);
    }
}
