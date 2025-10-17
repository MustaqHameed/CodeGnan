package com.codegnan.operatorexamples;
import java.util.Scanner;
public class StudentGradeCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Marks : ");
		
		int marks = sc.nextInt();
		String grade = (marks>=90)?"A":(marks >= 80)?"B":(marks >= 70)?"C":
			(marks >= 60)?"D":(marks >= 50)?"E":"f";
		System.out.println("Grade for "+ marks +" is " + grade);
		sc.close();
	}

}
