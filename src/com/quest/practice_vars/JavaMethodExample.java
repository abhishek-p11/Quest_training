package com.quest.practice_vars;

public class JavaMethodExample {
    private static final int  x=30;
    public static void main(String[] args)
    {
        JavaMethodExample javaMethodExample = new JavaMethodExample();
        javaMethodExample.display("hello");
        int result=javaMethodExample.add(2,3);
        System.out.println(result);
//x=40;
       // System.out.println(x);
    }

    /**
     * display sting
     * @param str -name
     *
     */

    private void display(String str) {

        System.out.println(str);
    }

    /**
     * add two numbers
     * @param a
     * @param b
     * @return -sum
     */

    private int add(int a, int b)
    {
        return a+b;
    }
}
