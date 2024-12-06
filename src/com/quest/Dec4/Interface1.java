package com.quest.Dec4;

public interface Interface1 {
        void method1();

        default void defaultMethod() {
            System.out.println("Interface1 Default Method");
        }
}
