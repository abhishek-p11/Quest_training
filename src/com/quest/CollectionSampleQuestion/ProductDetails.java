package com.quest.CollectionSampleQuestion;
import java.util.*;
public class ProductDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> productPriceMap = new HashMap<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add/Update Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Find Most Expensive Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    productPriceMap.put(name, price); // Add/Update product
                    System.out.println("Product added/updated successfully.");
                    break;

                case 2:
                    System.out.println("\nProduct List:");
                    if (productPriceMap.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        printMap(productPriceMap);
                    }
                    break;

                case 3:
                    if (productPriceMap.isEmpty()) {
                        System.out.println("No products available to analyze.");
                    } else {
                        String mostExpensiveProduct = findMostExpensiveProduct(productPriceMap);
                        System.out.println("Product with the Highest Price: " + mostExpensiveProduct);
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void printMap(Map<String, Double> map) {
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }
    }

    public static String findMostExpensiveProduct(Map<String, Double> map) {
        String mostExpensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            if (entry.getValue() > highestPrice) {
                highestPrice = entry.getValue();
                mostExpensiveProduct = entry.getKey();
            }
        }
        return mostExpensiveProduct + " (₹" + highestPrice + ")";
    }
}
