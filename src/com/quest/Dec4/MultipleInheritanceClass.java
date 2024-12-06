package com.quest.Dec4;

class MultiInheritanceClass implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method1 from Interface1");
    }

    public void method2() {
        System.out.println("Method2 from Interface2");
    }

    @Override
    public void defaultMethod() {
        System.out.println("Custom Default Method in MultiInheritanceClass");
    }
}
