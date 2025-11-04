package com.codegnan.oopsassignments;

public class LibrarySystem {

    public static void main(String[] args) {
        // Create two Book objects
        Book b1 = new Book("Java", "mno");
        Book b2 = new Book("Python", "xyz");

        // Display details
        b1.displayInfo();
        b2.displayInfo();

        // Borrow first book twice
        b1.borrowBook();
        b1.borrowBook(); 

        // Return first book twice
        b1.returnBook();
        b1.returnBook(); 
        
        // Final info
        b2.displayInfo();
    }
}
