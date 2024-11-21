package com.quest.Vehicle;

class Car extends Vehicle implements Describable {
    private int doors;

    public Car(String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors; // Using 'this' to access the instance variable
    }

    @Override
    public String describe() {
        return "This is a car with " + doors + " doors.";
    }

    // Overriding toString method
    @Override
    public String toString() {
        return super.toString() + ", Doors: " + doors;
    }

    // Method demonstrating the use of final parameters
    public void printDetails(final String prefix) {
        System.out.println(prefix + ": " + this.toString());
    }
}

