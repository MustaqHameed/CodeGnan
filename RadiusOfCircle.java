package com.codegnan.fundamentals;
import java.util.Scanner;

public class RadiusOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Radius : ");
		double radius = sc.nextDouble();
		double area = Math.PI * radius * radius;
		System.out.println("The area of the circle is:"+area);
		sc.close();

	}

}
