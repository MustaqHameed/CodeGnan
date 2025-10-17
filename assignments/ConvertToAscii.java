package com.assignments;
import java.util.Scanner;

public class ConvertToAscii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give Your Character : ");
		char character = sc.next().charAt(0);
		int result = (int)character;
		System.out.println("Your Converted Character Into ASCII Value is : " + result);
		sc.close();
		
	}

}
