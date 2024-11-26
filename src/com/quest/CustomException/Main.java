package com.quest.CustomException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        Manager manager = null;
        while (employee == null) {
            try {
                System.out.println("Enter the employee details:");
                System.out.println("eneter the employee name");
                String name = sc.nextLine();
                System.out.println("eneter the employee age");
                int age = sc.nextInt();
                if (age < 18) {
                    throw new InvalidInputException("age is less than 18");
                }
                System.out.println("eneter the employee salary");
                double salary = sc.nextDouble();
                if (salary < 0) {
                    throw new InvalidInputException("salary is negative");
                }
                employee = new Employee(name, age, salary);
                System.out.println(employee);
            } catch (InvalidInputException e) {
                System.out.println("Invalidinputexception " + e.getMessage());

            } catch (InputMismatchException e) {
                System.out.println("Inputmismatchexception ");
            }
        }
            while (manager == null) {
                try {
                    System.out.println("Enter the Manger details:");
                    System.out.println("eneter the manager name");
                    String name1 = sc.nextLine();
                    System.out.println("eneter the manager age");
                    int age1 = sc.nextInt();
                    if (age1 < 18) {
                        throw new InvalidInputException("age is less than 18");
                    }
                    System.out.println("eneter the manager salary");
                    double salary1 = sc.nextDouble();
                    if (salary1 < 0) {
                        throw new InvalidInputException("salary is negative");
                    }
                    System.out.println("Enter the team size");
                    int teamSize = sc.nextInt();
                    manager = new Manager(name1, age1, salary1, teamSize);
                    System.out.println(manager);

                } catch (InvalidInputException e) {
                    System.out.println("Invalidinputexception " + e.getMessage());

                } catch (InputMismatchException e) {
                    System.out.println("Inputmismatchexception ");
                }
            }
        }
    }
