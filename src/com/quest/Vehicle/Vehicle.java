package com.quest.Vehicle;

public class Vehicle {
    private String brand; // Instance variable
    private String model;

    // Default constructor
    public Vehicle() {
        this.brand = "Unknown Brand";
        this.model = "Unknown Model";
    }

    // Parameterized constructor
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }


    // Overridable method
    public void Drive() {
        System.out.println("Drive Vehicle");
    }

    // Overridden toString method
    @Override
    public String toString() {
        return "Vehicle [Brand: " + brand + ", Model: " + model + "]";
    }
}

