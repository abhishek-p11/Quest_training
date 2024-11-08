package com.quest.practice_vars;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = "  Hai  Hello  ";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf(' '));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.substring(3));
        System.out.println(str.subSequence(1, 4));
        System.out.println(str2.trim());
        System.out.println(str2.replace('i', 'y'));
        System.out.println(str.concat(str2));
    }
}
