package com.assignments;
import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give Your Number : ");
		int i = sc.nextInt();
		String result = (i%2 == 0)?"Even":"Odd";
		System.out.println(result);
		sc.close();
	}

}
