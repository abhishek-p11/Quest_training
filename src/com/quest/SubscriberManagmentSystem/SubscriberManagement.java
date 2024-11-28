package com.quest.SubscriberManagmentSystem;

import java.io.Serializable;

public class SubscriberManagement implements Serializable {
    private String id;
    private String name;
    private String phoneNumber;
    private String planType; // Prepaid/Postpaid
    private double balance;

    public SubscriberManagement(String id, String name, String phoneNumber, String planType, double balance) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.planType = planType;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getPlanType() {
        return planType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Subscriber [ID=" + id + ", Name=" + name + ", Phone=" + phoneNumber +
                ", Plan=" + planType + ", Balance=" + balance + "]";
    }
}



