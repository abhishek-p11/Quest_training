package com.quest.streams;

public class MultipleinheritanceExample implements Interface1,Interface2{
    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    @Override
    public void defaultMethod1() {
        Interface1.super.defaultMethod1();
    }
}
