package com.quest.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.toString());


        Car car = new Car("Toyota", "Camry", 4);
        System.out.println(car.toString());
        System.out.println(car.describe());

        // Demonstrating the use of final parameter
        car.printDetails("Car Details");
    }
}
