package com.codegnan.operatorexamples;
import java.util.Scanner;
public class ClaculatingRa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount : ");
		double purchaseAmount = sc.nextDouble();
		double discount = (purchaseAmount>100)?0.2:(purchaseAmount >= 50)? 0.1 : 0.0;
		double discountAmount = purchaseAmount*discount;
		double remainingAmount = purchaseAmount - discountAmount;
		double percentDiscount = discount*100;
		System.out.println("Amount after paying : "+percentDiscount+ "% dsicount" +remainingAmount);
		System.out.println("Discount applied : " +discountAmount);
		sc.close();
		
	}

}
