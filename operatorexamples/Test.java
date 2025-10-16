package com.codegnan.operatorexamples;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		/* 1)Arithmetic operation
		-----------------------
		System.out.println(10/0); // Arithmetic Exception
		System.out.println(10.0/0); // Positive infinity
		System.out.println(-10.0/0);// Negetive Positive infinity
		System.out.println(0.0/0); // NAN
		System.out.println(-0.0/0);//NAN	*/
		
		/* 2)Concatination of String
		 ----------------------------
		int a = 10 , b = 20 , c = 50;
		String d = "Codegnan";
		System.out.println(a+b+c+d);//80Codegnan
		System.out.println(b+c+d+a);//70Codegnan10
		System.out.println(c+d+a+b);//50Codegnan1020
		System.out.println(d+a+b+c);//Codegnan102050 */
		
		/* 3) Increment and Decrement
		-----------------------------
		int a = 376;
		int b = ++a;
		int c = a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		/*4) Bitwise Operator
		 --------------------
		System.out.println(10 & 2);
		System.out.println(10| 2);
		System.out.println(10 ^ 2);*/
		
		/*5) Logical Operator
          -------------------
		System.out.println(true && true);
		System.out.println((10<2)|| false);*/
		
		int i, k ;
		i =10;
		k = i < 0 ? -i:i;
		System.out.println("absolute value of " +i + " is " + k);
		i = -10;
		k = i < 0 ? -i:i;
		System.out.println("absolute value of " +i + " is " + k);
		
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		
		String result = (age > 18 )? "Eligible to vote":"Not Eligible";
		System.out.println(result);
		sc.close();
		











		}

}
