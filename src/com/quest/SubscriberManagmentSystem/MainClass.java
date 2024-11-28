package com.quest.SubscriberManagmentSystem;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        TelecomManagementSystem tms = new TelecomManagementSystem();
        tms.loadData();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nTelecom Subscriber Management System");
            System.out.println("1. Add Subscriber");
            System.out.println("2. Update Balance");
            System.out.println("3. List Subscribers");
            System.out.println("4. Log Call");
            System.out.println("5. Display Call History");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.next();
                    System.out.print("Enter Plan Type (Prepaid/Postpaid): ");
                    String plan = scanner.next();
                    System.out.print("Enter Balance: ");
                    double balance = scanner.nextDouble();
                    tms.addSubscriber(new SubscriberManagement(id, name, phone, plan, balance));
                    break;

                case 2:
                    System.out.print("Enter Subscriber ID: ");
                    id = scanner.next();
                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();
                    tms.updateBalance(id, amount);
                    break;

                case 3:
                    tms.listSubscribers();
                    break;

                case 4:
                    System.out.print("Enter Subscriber ID: ");
                    id = scanner.next();
                    System.out.print("Enter Call Type (Local/STD/ISD): ");
                    String callType = scanner.next();
                    System.out.print("Enter Duration (in minutes): ");
                    int duration = scanner.nextInt();
                    tms.logCall(id, callType, duration);
                    break;

                case 5:
                    System.out.print("Enter Subscriber ID: ");
                    id = scanner.next();
                    tms.displayCallHistory(id);
                    break;

                case 6:
                    System.out.print("Enter Subscriber ID: ");
                    id = scanner.next();
                    tms.generateBill(id);
                    break;

                case 7:
                    tms.saveData();
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 7);
        scanner.close();
    }
}

