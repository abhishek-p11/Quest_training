package com.quest.oops.test2;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        StringBuffer sb2 = new StringBuffer("welcome");
        String str = new String("Hello World");
        StringBuilder sb3 = new StringBuilder("Hello World");
        StringBuilder sb4 = new StringBuilder("welcome");
        check1(sb, sb2);
        check2(sb3,sb4);


        sb2.append("StringBuiderexample");
        System.out.println(sb2);
        sb.append("StringBufferxample");
        System.out.println(sb);


        sb.reverse();
        System.out.println(sb);
        sb2.reverse();
        System.out.println(sb2);

        sb.replace(10, 11, " my ");
        System.out.println(sb);
        sb2.replace(10, 11, " my ");
        System.out.println(sb2);

        sb.delete(0, 5);
        System.out.println(sb);
        sb2.delete(0, 5);
        System.out.println(sb2);

        sb.insert(0, "welco");
        System.out.println(sb);
        sb.insert(0, "welco");
        System.out.println(sb);

        char s = sb.charAt(5);
        System.out.println(s);
        char s1 = sb.charAt(5);
        System.out.println(s1);


    }

    static void check1(StringBuffer sb, StringBuffer sb2) {

        if (sb == sb2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if(sb.equals(sb2)) {
            System.out.println("true");

        }
        else{
            System.out.println("false");
        }

    }
    static void check2(StringBuilder sb3, StringBuilder sb4) {
        if (sb3 == sb4) {
            System.out.println("true");
        }
        else {
            System.out.println("false");

        }
        if(sb3.equals(sb4)) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

