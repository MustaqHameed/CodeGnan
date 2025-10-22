package com.assignments;
import java.util.Scanner;
public class TaxCalculation {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter annual income: ");
		        double income = scanner.nextDouble();
		        scanner.close();
		        
		        double rate = income < 300000 ? 0.05 : 
		                     (income <= 1000000 ? 0.10 : 0.15);
		        double tax = income * rate;
		        
		        // Bonus using ternary
		        double bonus = (income > 2000000) ? tax * 0.01 : 0.00;
		        tax += bonus;
		        
		        System.out.printf("Tax Rate: , Total Tax: ", rate * 100, tax);
		        scanner.close();
	}

}
