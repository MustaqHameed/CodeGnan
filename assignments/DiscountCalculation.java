package com.assignments;
import java.util.Scanner;
public class DiscountCalculation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total shopping amount: ");
        double amount = scanner.nextDouble();
        scanner.close();
        
        double discountRate = amount >= 1000 ? 0.20 : 
                             (amount >= 500 ? 0.10 : 0.00);
        double discount = amount * discountRate;
        double finalAmount = amount - discount;
        
        System.out.printf("Discount: , Final Amount: ", discount, finalAmount);
        scanner.close();
	}

}
