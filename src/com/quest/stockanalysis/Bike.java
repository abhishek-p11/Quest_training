package com.quest.stockanalysis;

public class Bike implements Vehicle {


    @Override
    public void wheel() {
        System.out.println("bike horn");
    }

    @Override
    public void horn() {
        System.out.println("bike wheel");
    }
}
