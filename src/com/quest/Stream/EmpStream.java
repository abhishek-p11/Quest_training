package com.quest.Stream;

import com.quest.File.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class EmpStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 30, 60000, "HR", 5),
                new Employee(2, "Bob", 40,80000 , "IT", 10),
                new Employee(3, "Charlie", 35, 70000, "Finance", 8),
                new Employee(4, "Diana", 28, 8000, "IT", 6),
                new Employee(5, "Eve", 45,45000 , "HR", 15),
                new Employee(6, "Frank", 50,80000 , "Finance", 20)
        );

        System.out.println("Employees sorted by salary:");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println("\nEmployees in IT department:");
        employees.stream()
                .filter(e -> e.getSalary()>50000)
                .forEach(System.out::println);

        System.out.println("\nEmployee with maximum salary:");
        employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(System.out::println);

        System.out.println("\nEmployees sorted by experience (skipping first 2):");
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getExperience).reversed())
                .skip(2)
                .forEach(System.out::println);

        System.out.println("\nCustom action: Employee names in uppercase:");
        employees.stream()
                .map(e -> e.getName().toUpperCase())
                .forEach(System.out::println);

        System.out.println("\nEmployees collected into a map (ID as key):");
        Map<Integer, Employee> employeeMap = employees.stream()
                .collect(toMap(Employee::getId, e -> e));
        employeeMap.forEach((id, emp) -> System.out.println(id + " -> " + emp));


        double totalSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.println("\nTotal Salary of all employees: " + totalSalary);


    }
}
