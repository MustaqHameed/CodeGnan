package com.codegnan.oopsassignments;

public class BankApp {

    public static void main(String[] args) {
        // Create first account
        BankAccount acc1 = new BankAccount();
        acc1.setAccountHolder("Rahul");
        acc1.setAccountNumber("Acc001");
        acc1.setBalance(5000);

        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.displayAccountInfo();

        // Create second account
        BankAccount acc2 = new BankAccount();
        acc2.setAccountHolder("Neha");
        acc2.setAccountNumber("Acc002");
        acc2.setBalance(8000);

        acc2.deposit(2500);
        acc2.withdraw(12000); // insufficient funds
        acc2.displayAccountInfo();
    }
}
