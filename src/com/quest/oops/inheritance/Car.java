package com.quest.oops.inheritance;

public class Car {
    String make;
    String model;
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void carDisplay(){
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}
