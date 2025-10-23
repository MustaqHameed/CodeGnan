package com.assignments;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income: ");
        int income = sc.nextInt();

        int taxPercentage;

        if (income <= 10000)
            taxPercentage = 0;
        else if (income <= 50000)
            taxPercentage = 10;
        else if (income <= 100000)
            taxPercentage = 20;
        else
            taxPercentage = 30;

        System.out.println("Tax Percentage: " + taxPercentage + "%");
        sc.close();
	}

}
