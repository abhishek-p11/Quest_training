package com.quest.oops.test2;

public class A {
    public static void main(String[] args) {
        A a = new A();
        a.add();

    }
    void add(){
        System.out.println("A classadd method with no argument");
    }
    void add(int a, int b){
        int c = a + b;
        System.out.println("A classadd method with argument"+c);
    }
}
