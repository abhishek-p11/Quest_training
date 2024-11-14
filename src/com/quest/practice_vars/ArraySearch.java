package com.quest.practice_vars;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search:");
        int n = sc.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        ArrayIndex(array, n);

    }
    public static void ArrayIndex(int[] array ,int n) {
        int temp=0;
        int i;
        for ( i = 0; i <array.length ; i++) {
            if (array[i] == n) {
                temp=1;
                break;
            }
        }
        if (temp==1){
            System.out.println("index position:"+i);
        }
        else{
            System.out.println("-1");
        }

    }
}
