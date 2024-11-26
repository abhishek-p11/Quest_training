package com.quest.ExceptionHandling;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {

            Manager manager = new Manager("Arun", 50000, "IT");

            manager.displayDetails();

            System.out.print("Enter new salary for the manager: ");
            double newSalary = scanner.nextDouble();
            manager.setSalary(newSalary);

            manager.displayDetails();

            System.out.print("Enter bonus amount: ");
            double bonus = scanner.nextDouble();
            manager.calculateBonus(bonus);

        } catch (IOException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }

    }
}
