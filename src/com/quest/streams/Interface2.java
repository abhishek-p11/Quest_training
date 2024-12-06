package com.quest.streams;

public interface Interface2 {
    void method1();
    void method2();

    default void defaultMethod1() {
        System.out.println("Default implementation of defaultMethod1 from Interface2");
    }

}
