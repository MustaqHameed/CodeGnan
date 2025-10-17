package com.assignments;
import java.util.Scanner;
public class PositiveNegetiveZero {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your number here : ");
	int i = sc.nextInt();
	String result = (i>0)?"positive":(i<0)?"negetive":"zero";
	System.out.println(result);
	sc.close();
	}

}
