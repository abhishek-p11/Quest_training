package com.quest.CollectionSampleQuestion;

import java.util.*;
public class SearchEmployee {
    public static void main(String[] args) {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee ID to search:");
        int searchId = scanner.nextInt();

        String employeeName = employeeMap.get(searchId);

        if (employeeName != null) {
            System.out.println("Employee Name: " + employeeName);
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

    }
}
