package com.quest.practice_vars;

import java.util.Scanner;

public class Paliandrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if (str==null){
            System.out.println("the string is null");
            return;
        }
        StringBuilder sb=new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        String reversestring=reverse.toString();
        if(str.equals(reversestring)){
            System.out.println("the string is a paliandrome");
        }
        else{
            System.out.println("the string is not a paliandrome");
        }
    }
}
