package com.assignments;
import java.util.Scanner;
public class NumberSignCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        scanner.close();
        
        String sign = num > 0 ? "Positive" : 
                     (num < 0 ? "Negative" : "Zero");
        
        System.out.println("The number is: " + sign);
        scanner.close();
	}

}
