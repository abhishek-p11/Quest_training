package com.quest.stockanalysis;

public class Car implements Vehicle {

    @Override
    public void wheel() {
        System.out.println("car horn");
    }

    @Override
    public void horn() {
     System.out.println("car wheel");
    }
}
