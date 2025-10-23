package com.assignments;

import java.util.Scanner;

public class BIMcalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.printf("BMI: %.2f%n", bmi);

        if (bmi < 18.5)
            System.out.println("Category: Underweight");
        else if (bmi < 25)
            System.out.println("Category: Normal");
        else if (bmi < 30)
            System.out.println("Category: Overweight");
        else
            System.out.println("Category: Obese");
        sc.close();
	}

}
