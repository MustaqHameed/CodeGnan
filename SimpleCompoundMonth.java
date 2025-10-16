package com.codegnan.fundamentals;
import java.util.Scanner;

public class SimpleCompoundMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the Annual Rate of Interest (in %): ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time (in months): ");
        int months = sc.nextInt();

        double timeInYears = months / 12.0;

        double simpleInterest = (principal * rate * timeInYears) / 100;
        double totalWithSI = principal + simpleInterest;

        double amountWithCI = principal * Math.pow((1 + rate / 100), timeInYears);
        double compoundInterest = amountWithCI - principal;
        

        System.out.println("Time into years : " +timeInYears);
        System.out.println("Simple Intrest : "+simpleInterest);
        System.out.println("Total With SimpleIntrest : "+totalWithSI);
        System.out.println("Compound Intrest : "+compoundInterest);
        System.out.println("Total Amount With Compound Intrest : "+amountWithCI);
        sc.close();
	}

}
