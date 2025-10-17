package com.assignments;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your year here : ");
		int i = sc.nextInt();
		String result = (i%4 == 0 && i%100 != 0)||(i%400 == 0)? "Leap Year":"Not a LeapYear";
		System.out.println(result);
		sc.close();
		
	}

}
