package com.quest.practice_vars;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        int totalSalary = 0;
        double avgSalary = 0;
        int bonus = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of employees : ");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a integer variable");
            sc.next();
        }
        int n = sc.nextInt();
        //2D array for storing each employee 12 month salary and base salary
        int[][] salary = new int[n][13];
        String[] names = new String[n];
        //to take input from user
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.print("Enter the name of the employee" + (i + 1) + " : ");
            names[i] = sc.next();
            System.out.print("Enter the base salary for " + names[i] + ": ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a integer variable");
                sc.next();
            }
            salary[i][0] = sc.nextInt();
            for (int j = 1; j < 13; j++) {
                System.out.print("Enter salary for month " + j + "(0-100000): ");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a integer variable");
                    sc.next();
                }
                salary[i][j] = sc.nextInt();
                if (salary[i][j] >= 0 && salary[i][j] <= 100000) {
                    continue;
                } else {
                    System.out.println(" please Enter the salary between 0-100000 ");
                    j = j - 1;

                }
            }
        }
        System.out.print("--- Employee Salary Report ---\n");
        // to print employee salary details
        for (int i = 0; i < n; i++) {
            totalSalary = 0;
            System.out.print(" Employee Name: " + names[i] + "\n");
            System.out.print(" Base Salary: " + salary[i][0] + "\n");
            System.out.print(" Monthly Salary breakdown:" + "\n");
            for (int j = 1; j < 13; j++) {
                System.out.print("month" + j + ":" + salary[i][j] + "\n");
            }
            for (int k = 1; k < 13; k++) {
                totalSalary += salary[i][k];
                bonus += (salary[i][k] - salary[i][0]);
            }
            System.out.println("Total Salary for the Year:" + totalSalary);
            avgSalary = totalSalary / 12;
            System.out.println("Average Monthly Salary:" + avgSalary);
            System.out.println("Bonus:" + bonus);

        }
    }


}


