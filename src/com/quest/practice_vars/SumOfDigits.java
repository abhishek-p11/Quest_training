package com.quest.practice_vars;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = sc.nextInt();
        while (number != 0) {
            int ld = number % 10;
            sum = sum + ld;
            number /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}


