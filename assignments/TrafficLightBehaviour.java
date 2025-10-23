package com.assignments;

import java.util.Scanner;

public class TrafficLightBehaviour {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter light color (Green/Yellow/Red): ");
        String light = sc.next().toLowerCase();

        System.out.print("Enter current hour (0–23): ");
        int hour = sc.nextInt();

        if (light.equals("green")) {
            System.out.println("Action: Go");
        } else if (light.equals("red")) {
            System.out.println("Action: Stop");
        } else if (light.equals("yellow")) {
            if (hour >= 6 && hour < 18)
                System.out.println("Action: Slow");
            else
                System.out.println("Action: Stop");
        } else {
            System.out.println("Invalid input");
            sc.close();
        }

	}

}
