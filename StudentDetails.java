package com.codegnan.fundamentals;
import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student Name : ");
		String name = sc.next();
		System.out.print("Enter You RollNo : ");
		int rollNo = sc.nextInt();
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		System.out.print("Enter Your Grade : ");
		String grade = sc.next();
		
		System.out.println("Student Details");
		System.out.println("Name   : "+name);
		System.out.println("RollNO : "+rollNo);
		System.out.println("Age    :"+age);
		System.out.println("Grade  :"+grade);
		
		sc.close();

	}

}
