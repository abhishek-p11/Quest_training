package com.quest.AutoMobileManagementSystem;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {
    private String customerId;
    private String name;
    private String email;
    private List<Vehicle> purchasedVehicles;
    private List<LocalDateTime> purchaseDates;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.purchasedVehicles = new ArrayList<>();
        this.purchaseDates = new ArrayList<>();
    }

    public void addPurchasedVehicle(Vehicle vehicle, LocalDateTime purchaseDate) {
        this.purchasedVehicles.add(vehicle);
        this.purchaseDates.add(purchaseDate);
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("Customer ID: " + customerId + ", Name: " + name +
                ", Email: " + email + "\nPurchased Vehicles:\n");
        for (int i = 0; i < purchasedVehicles.size(); i++) {
            details.append(purchasedVehicles.get(i)).append(", Purchase Date: ")
                    .append(purchaseDates.get(i)).append("\n");
        }
        return details.toString();
    }
}

