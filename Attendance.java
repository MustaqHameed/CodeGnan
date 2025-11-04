package com.codegnan.oopsassignments;

class Attendance {
    int id;
    String name;
    String status;

    Attendance(int i, String n, String s) {
        if (i <= 0) {
            System.out.println("Error: ID must be positive");
        } else if (!(s.equals("Present") || s.equals("Absent"))) {
            System.out.println("Error: Status must be Present or Absent");
        } else {
            id = i;
            name = n;
            status = s;
            System.out.println("ID: " + id + ", Name: " + name + ", Status: " + status);
        }
    }

    public static void main(String[] args) {
        Attendance a1 = new Attendance(101, "Emma Wilson", "Present");
    }
}
