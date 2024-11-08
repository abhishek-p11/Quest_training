package com.quest.practice_vars;

public class PracticeOperators {
    public static void main(String[] args) {
        int a=10;
        int b=5;
       // Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //relational operators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        boolean x=true;
        boolean y=false;

        //logical operators
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(x != y);

        int z=10;
        //assignment operators
        z+=5;//z=z+5
        //unary operators
        System.out.println(z);
        System.out.println(z++);//z=16 postincrement
        System.out.println(++z);//preincrement
        System.out.println(z);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);

        int p=10;
        int q=5;
        //ternary operators
        int result = p>15 ? ++q : 0;
        System.out.println(result);

    }
}
