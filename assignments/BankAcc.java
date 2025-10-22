package com.assignments;
import java.util.Scanner;
public class BankAcc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account balance: ");
        double balance = scanner.nextDouble();
        scanner.close();
        
        String status = balance >= 1000 ? "Good Standing" : 
                       (balance >= 500 ? "Low Balance" : "Account Overdrawn");
        
        System.out.println("Account Status: " + status);
        scanner.close();
	}

}
