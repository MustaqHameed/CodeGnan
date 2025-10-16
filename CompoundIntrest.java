package com.codegnan.fundamentals;
import java.util.Scanner;


public class CompoundIntrest {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter you Principle Amount : ");
			double principle = sc.nextDouble();
			System.out.print("Enter Rate of Intrest : ");
			double rate = sc.nextDouble();
			System.out.print("Enter the time (year) : ");
			double time = sc.nextDouble();
			
	        double amount = principle * Math.pow((1 + rate / 100), time);
	        double compoundInterest = amount - principle;
	        System.out.println("Compount Intrest is : "+compoundInterest);
	        System.out.println("Total Amount: "+amount);
	        sc.close();

		
	}

}
