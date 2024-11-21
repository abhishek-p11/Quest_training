package com.quest.oops.inheritance;

public class SuperCar extends Car{
    double topSpeed;
    public SuperCar(String make,String model,double topSpeed) {
        super(make,model);
        this.topSpeed = topSpeed;
    }

    @Override
    public void carDisplay() {
        super.carDisplay();
        System.out.println("Top Speed: " + topSpeed);
    }
}
