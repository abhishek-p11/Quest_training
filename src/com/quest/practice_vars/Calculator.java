package com.quest.practice_vars;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n, result;
        int e, add;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("please enter the starting number:");
            n = sc.nextInt();
            System.out.println("current result=" + n);
            System.out.println("1.Addition:");
            System.out.println("2.Subtraction:");
            System.out.println("3.Multiplication:");
            System.out.println("4.Division:");
            System.out.println("5.squareRoot:");
            System.out.println("6.clear:");
            System.out.println("7.exit");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number to add:");
                    add = sc.nextInt();
                    result = add + n;
                    System.out.println("result=" + result);
                    break;
                case 2:
                    System.out.println("Enter the number to sub:");
                    add = sc.nextInt();
                    result = n - add;
                    System.out.println("result=" + result);
                    break;
                case 3:
                    System.out.println("Enter the number to mul:");
                    add = sc.nextInt();
                    result = add * n;
                    System.out.println("result=" + result);
                    break;
                case 4:
                    System.out.println("Enter the number to div:");
                    add = sc.nextInt();
                    result = n / add;
                    System.out.println("result=" + result);
                    break;
                case 5:
                    System.out.println("Enter the number to squarroot:");
                    add = sc.nextInt();
                    result = Math.sqrt(add);
                    System.out.println(result);
                    break;
                case 7:
                    System.out.println("clearing");
                    result=0;
                    break;

                    case 6:
                    System.exit(0);
                    break;

                default:
                    System.out.println("invalid choice");
                    break;

            }
            System.out.print("Do you want to perform another operation? (yes/no): ");
            String continueChoice = sc.next();
            if (continueChoice.equalsIgnoreCase("no")) {
                System.out.println("Exiting the calculator.");
                break;

            }
        }
    }
}
