package com.assignments;
import java.util.Scanner;
public class DivisibleBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		
		int i = sc.nextInt();
		String result = (i%5==0)?"Divisible":"Not divisible";
		System.out.println(result);
		sc.close();
	 }

}
