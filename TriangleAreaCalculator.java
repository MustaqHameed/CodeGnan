package com.codegnan.fundamentals;
import java.util.Scanner;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base Here : ");
		double base = sc.nextDouble();
		System.out.println("Enter Height Here : ");
		double height = sc.nextDouble();
		double area = 0.5 * base * height;
		System.out.println(" Area of Triangle is : "+area);
		 sc.close();
	}

}
