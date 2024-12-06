package com.quest.AutoMobileManagementSystem;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Vehicle> inventory = new ArrayList<>(Arrays.asList(
                    new Car("C001", "Toyota", "Camry", 30000, LocalDate.of(2020, 5, 15), 5),
                    new Car("C002", "Honda", "Civic", 25000, LocalDate.of(2019, 8, 20), 5),
                    new Car("C003", "Toyota", "Corolla", 20000, LocalDate.of(2021, 3, 10), 5),
                    new Bike("B001", "Yamaha", "YZF-R15", 15000, LocalDate.of(2022, 6, 5), 155),
                    new Bike("B002", "Honda", "CBR500R", 7000, LocalDate.of(2021, 10, 25), 500)
            ));
            // Create customers
            Customer customer1 = new Customer("CU001", "Alice", "alice@example.com");
            Customer customer2 = new Customer("CU002", "Bob", "bob@example.com");

            // Customer purchases
            Map<Customer, Set<Vehicle>> sales = new HashMap<>();
            sales.put(customer1, new HashSet<>());
            sales.put(customer2, new HashSet<>());

            // Purchase vehicles
            purchaseVehicle(inventory, sales, customer1, "C001");
            purchaseVehicle(inventory, sales, customer2, "B001");

            // Print sales data
            sales.forEach((customer, vehicles) -> {
                System.out.println(customer);
                vehicles.forEach(System.out::println);
            });

            // Serialize sales data
            serializeSalesData(sales);

            // Deserialize and print sales data
            Map<Customer, Set<Vehicle>> deserializedSales = deserializeSalesData();
            System.out.println("Deserialized Sales Data:");
            deserializedSales.forEach((customer, vehicles) -> {
                System.out.println(customer);
                vehicles.forEach(System.out::println);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to handle a vehicle purchase
    public static void purchaseVehicle(List<Vehicle> inventory, Map<Customer, Set<Vehicle>> sales, Customer customer, String vehicleId) throws VehicleNotAvailableException {
        Vehicle vehicle = inventory.stream()
                .filter(v -> v.getVehicleId().equals(vehicleId))
                .findFirst()
                .orElseThrow(() -> new VehicleNotAvailableException("Vehicle with ID " + vehicleId + " not available."));
        sales.get(customer).add(vehicle);
        customer.addPurchasedVehicle(vehicle, LocalDateTime.now());
        inventory.remove(vehicle);
    }

    // Serialize sales data
    public static void serializeSalesData(Map<Customer, Set<Vehicle>> sales) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file1.txt"))) {
            oos.writeObject(sales);
        }
    }

    // Deserialize sales data
    public static Map<Customer, Set<Vehicle>> deserializeSalesData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file1.txt"))) {
            return (Map<Customer, Set<Vehicle>>) ois.readObject();
        }
    }
}

