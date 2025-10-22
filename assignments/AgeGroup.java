package com.assignments;
import java.util.Scanner;
public class AgeGroup {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.close();
        
        String category = age < 12 ? "Child" : 
                         (age <= 19 ? "Teenager" : 
                         (age <= 64 ? "Adult" : "Senior"));
        
        System.out.println("Age group: " + category);
        scanner.close();
	}

}
