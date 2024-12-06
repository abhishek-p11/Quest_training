package com.quest.AutoMobileManagementSystem;

import java.io.Serializable;
import java.time.LocalDate;

abstract class Vehicle implements Cloneable, Serializable {
    private String vehicleId;
    private String brand;
    private String model;
    private double price;
    private LocalDate manufactureDate;

    public Vehicle(String vehicleId, String brand, String model, double price, LocalDate manufactureDate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId + ", Brand: " + brand + ", Model: " + model +
                ", Price: " + price + ", Manufacture Date: " + manufactureDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Vehicle cloned = (Vehicle) super.clone();
        cloned.setPrice(this.price * 0.9); // Apply a 10% discount
        return cloned;
    }
}
