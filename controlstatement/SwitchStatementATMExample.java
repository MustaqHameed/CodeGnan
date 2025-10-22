package com.codegnan.controlstatement;

import java.util.Scanner;

public class SwitchStatementATMExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 50000; // Initial balance
        int pin = 1234;
        int enteredPin;

        System.out.print("Enter your PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println(" Invalid PIN! Please try again later.");
            return;
        }

        int choice;

        do {
            System.out.println("\n||===================================||");
            System.out.println("||============ ATM MENU =============||");
            System.out.println("|| 1. Deposit                        ||");
            System.out.println("|| 2. Withdraw                       ||");
            System.out.println("|| 3. Check Balance                  ||");
            System.out.println("|| 4. Exit                           ||");
            System.out.println("||===================================||");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount < 500) {
                        System.out.println(" Minimum deposit amount should be greater than 500.");
                    } else if (depositAmount % 100 != 0) {
                        System.out.println(" Please deposit in multiples of 100 (like 500, 700, 900).");
                    } else {
                        balance += depositAmount;
                        System.out.println(" Deposited " + depositAmount + " successfully.");
                        System.out.println(" New Balance: " + balance);
                    }
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount < 500) {
                        System.out.println(" Minimum withdrawal amount should be 500.");
                    } else if (withdrawAmount % 100 != 0) {
                        System.out.println(" Please withdraw in multiples of 100 (like 500, 700, 900).");
                    } else if (withdrawAmount > balance) {
                        System.out.println(" Insufficient Funds! Current Balance: " + balance);
                    } else {
                        balance -= withdrawAmount;
                        System.out.println(" Withdrawn " + withdrawAmount + " successfully.");
                        System.out.println(" Remaining Balance: " + balance);
                    }
                    break;

                case 3:
                    System.out.println(" Your current balance is: " + balance);
                    break;

                case 4:
                    System.out.println(" Thank you for using our ATM. Visit again!");
                    break;

                default:
                    System.out.println(" Invalid choice! Please select a valid option (1-4).");
                    break;
            }

        } while (choice != 4);

        sc.close();
    }
}
