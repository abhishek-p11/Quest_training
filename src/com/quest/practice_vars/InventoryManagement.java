package com.quest.practice_vars;

import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        String[] products = {"Product A", "Product B", "Product C", "Product D", "Product E"};
        int[][] inventory = {
                {100, 200},  // Product A: 100 units in stock, $200 each
                {50, 150},   // Product B: 50 units in stock, $150 each
                {50, 50},   // Product C: 50 units in stock, $50 each
                {75, 300},   // Product D: 75 units in stock, $300 each
                {150, 100}   // Product E: 150 units in stock, $100 each
        };
        int[] quantitiesSold = {100, 10, 60, 10, 30};
        System.out.println("-----Sales Report------");
        salesReport(inventory,products,quantitiesSold);
        System.out.println("-----Inventory Shortage Check------");
        inventoryShortageCheck(inventory,products,quantitiesSold);
        System.out.println("-----Restock Inventory:------");
        restockInventory(inventory,products,quantitiesSold);
        System.out.println("-----Sales Summary Based on Price Range------");
        salesSummery(inventory,products,quantitiesSold);
        System.out.println("-----Out-of-Stock Products------");
        outOfStock(inventory,products,quantitiesSold);
    }
    public static void salesReport(int[][] inventory,String[] products,int[] quantitiesSold) {
        double total=0;
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(products[i]+" sold "+quantitiesSold[i]+" units,Revenue:$"+(inventory[i][1]*quantitiesSold[i]));
            total += (inventory[i][1]*quantitiesSold[i]);

        }
        System.out.println("total revenue:$"+total);

    }
    public static void inventoryShortageCheck(int[][] inventory,String[] products,int[] quantitiesSold) {
        for (int i = 0; i < inventory.length; i++) {
            if((inventory[i][0]-quantitiesSold[i])<0) {
                System.out.println("Warning: Insufficient stock for "+products[i]+". Sold" +quantitiesSold[i]+" units, but only "+inventory[i][0]+"units were available.\n");
            }
        }
    }
    public static void restockInventory(int[][] inventory,String[] products,int[] quantitiesSold) {
        int restockAmount = 20;

        System.out.println("Restocking Product B with "+restockAmount+" units.");
        for (int i = 0; i < inventory.length; i++) {
            if(products[i].equals("Product B")) {
                System.out.println("updated stock for Product B :"+(inventory[i][0]+restockAmount));
            }
        }

    }
    public static void salesSummery(int[][] inventory,String[] products,int[] quantitiesSold) {
        double minPrice = 100;
        double maxPrice = 300;
        System.out.println("product in the price range $"+minPrice+" to $"+maxPrice);
        for (int i = 0; i < inventory.length; i++) {
            if(inventory[i][1]<=maxPrice && inventory[i][1]>=minPrice) {
                System.out.println(products[i]+" : Revenue=$ "+(double)(inventory[i][1]*quantitiesSold[i]));
            }
        }
    }
    public static void outOfStock(int[][] inventory,String[] products,int[] quantitiesSold) {
        System.out.println("out of stock products: ");
        for (int i = 0; i < inventory.length; i++) {
            if(inventory[i][0]-quantitiesSold[i]<=0) {
                System.out.println(products[i]);
            }
        }
    }
}
