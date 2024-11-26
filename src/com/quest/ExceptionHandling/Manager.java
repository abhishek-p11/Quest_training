package com.quest.ExceptionHandling;

import java.io.IOException;

class Manager extends Employee {
    private String department;


    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }


    public void calculateBonus(double bonus) throws IOException {
        if (bonus < 0) {
            throw new IOException("Bonus amount cannot be negative!");
        }
        System.out.println("Bonus for " + getName() + ": " + bonus);
    }
}
