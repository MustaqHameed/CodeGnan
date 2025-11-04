package com.codegnan.oopsassignments;

public class Book {
    // Private instance variables
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters 
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Borrow book
    public void borrowBook() {
        if (isAvailable) {
            setAvailable(false);
            System.out.println("You borrowed the book: " + getTitle());
        } else {
            System.out.println("Sorry, the book '" + getTitle() + "' is already borrowed.");
        }
    }

    // Return book
    public void returnBook() {
        if (!isAvailable) {
            setAvailable(true);
            System.out.println("You returned the book: " + getTitle());
        } else {
            System.out.println("The book '" + getTitle() + "' was not borrowed.");
        }
    }

    // Display book info
    public void displayInfo() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
    }
}
