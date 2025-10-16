package com.codegnan.fundamentals;
import java.util.Scanner;

public class SimpleIntrestTotalIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you Principle Amount : ");
		double principle = sc.nextDouble();
		System.out.print("Enter Rate of Intrest : ");
		double rate = sc.nextDouble();
		System.out.print("Enter the time (year) : ");
		double time = sc.nextDouble();
		
		double simpleIntrest = (principle*rate*time)/100;
		double totalAmount = principle + simpleIntrest;
		
		System.out.println("Simple Intrest is : "+simpleIntrest);
		System.out.println("Total Amount is : "+totalAmount);
		sc.close();
	}

}
