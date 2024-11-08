package com.quest.practice_vars;

import java.util.Scanner;

public class PaliandromNumber {

        public static void main(String[] args) {
            int number;
            int rev = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number: ");
            number = sc.nextInt();
            int temp = number;
            while (number != 0) {
                int ld = number % 10;
                rev = rev * 10 + ld;
                number /= 10;
            }
            if (rev == temp) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }
        }
    }

