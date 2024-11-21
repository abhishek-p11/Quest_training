package com.quest.BankAccoundManagementSystem;

import java.util.Scanner;

public class BankAccountManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\n--- Bank Account Management System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String savingsAccNo = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    String savingsName = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double savingsBalance = sc.nextDouble();
                    account = new SavingsAccount(savingsAccNo, savingsName, savingsBalance);
                    System.out.println("Savings Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    String currentAccNo = sc.next();
                    System.out.print("Enter Account Holder Name: ");
                    String currentName = sc.next();
                    System.out.print("Enter Initial Balance: ");
                    double currentBalance = sc.nextDouble();
                    account = new CurrentAccount(currentAccNo, currentName, currentBalance);
                    System.out.println("Current Account Created Successfully!");
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = sc.nextDouble();
                        Transaction deposit = new Deposit(account);
                        deposit.processTransaction(depositAmount);
                    } else {
                        System.out.println("No Account Found! Create an account first.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double withdrawAmount = sc.nextDouble();
                        Transaction withdraw = new Withdraw(account);
                        withdraw.processTransaction(withdrawAmount);
                    } else {
                        System.out.println("No Account Found! Create an account first.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        account.displayDetails();
                    } else {
                        System.out.println("No Account Found! Create an account first.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting... Thank you for using the system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
