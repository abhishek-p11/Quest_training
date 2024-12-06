package com.quest.Dec4;

public interface Interface2 {
        void method2();

        default void defaultMethod() {
            System.out.println("Interface2 Default Method");
        }
    }
