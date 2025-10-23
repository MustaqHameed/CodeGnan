package com.assignments;
import java.util.Scanner;
public class EmpSalaryBonus {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter years of experience: ");
	        int years = sc.nextInt();

	        System.out.print("Enter performance score (1-10): ");
	        int score = sc.nextInt();

	        double salary = 0;

	        if (years < 2)
	            salary = 30000;
	        else if (years <= 5)
	            salary = 50000;
	        else
	            salary = 70000;

	        if (score >= 8)
	            salary += salary * 0.10;

	        System.out.println("Total Salary including Bonus: " + salary);
	        sc.close();
	}

}
