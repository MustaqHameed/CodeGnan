package com.codegnan.operatorexamples;
import java.util.Scanner;
public class ParkingCharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Hours You have parked : ");
		int hours = sc.nextInt();
		
		int fee = (hours<=3)?(hours*2):(3*2 +(hours - 3)*1);
		System.out.println("Your Total Am2ount to be paid is : "+fee);
		sc.close();
	}

}
