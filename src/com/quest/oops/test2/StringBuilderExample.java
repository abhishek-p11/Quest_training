package com.quest.oops.test2;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Welcome to ");
        s1.append("StringBuiderexample");
        System.out.println(s1);
        s1.reverse();
        System.out.println(s1);
        s1.reverse();
        s1.replace(10,11," my ");
        System.out.println(s1);
        s1.delete(0,5);
        System.out.println(s1);
        s1.insert(0,"welco");
        System.out.println(s1);
        char s=s1.charAt(5);
        System.out.println(s);

    }
}
