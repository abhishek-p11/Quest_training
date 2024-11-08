package com.quest.practice_vars;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=5;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid input,enter positive number.");
            return;
        }
        int first=0;
        int second=1;
        System.out.println("fibonacci series of "+n+" times");
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            int third=first+second;
            first=second;
            second=third;
        }
    }
}
