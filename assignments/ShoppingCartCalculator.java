package com.assignments;
import java.util.Scanner;
public class ShoppingCartCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter total cart amount: ");
        double total = sc.nextDouble();

        System.out.print("Is it festival season? (true/false): ");
        boolean festival = sc.nextBoolean();

        System.out.print("Do you have premium membership? (true/false): ");
        boolean premium = sc.nextBoolean();

        double discount = 0;

        if (total >= 10000)
            discount = total * 0.20;
        else if (total >= 5000)
            discount = total * 0.10;

        total -= discount;

        if (festival)
            total -= total * 0.05;

        if (premium)
            total -= 200;

        System.out.println("Total discount applied: " + discount);
        System.out.println("Final Payable Amount: " + total);
        sc.close();
	}

}
