package com.quest.stockanalysis;

import java.util.Scanner;

public class StockAnalysisTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Equity Stock:");
        System.out.print("Stock Name: ");
        String equityName = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String equitySymbol = sc.nextLine();
        System.out.print("Sector: ");
        String sector = sc.nextLine();
        System.out.print("Number of days: ");
        int equityDays = sc.nextInt();
        int[] equityPrices = new int[equityDays];
        System.out.println("Enter prices: ");
        for (int i = 0; i < equityDays; i++) {
            equityPrices[i] = sc.nextInt();
        }


        sc.nextLine(); // Consume newline
        System.out.println("\nEnter details for Commodity Stock:");
        System.out.print("Commodity Type: ");
        String commodityType = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String commoditySymbol = sc.nextLine();
        System.out.print("Number of days: ");
        int commodityDays = sc.nextInt();
        int[] commodityPrices = new int[commodityDays];
        System.out.println("Enter prices: ");
        for (int i = 0; i < commodityDays; i++) {
            commodityPrices[i] = sc.nextInt();
        }


        StockAnalyzer equityStock = new EquityStockAnalyzer(equityName, equitySymbol, equityPrices, sector);
        StockAnalyzer commodityStock = new CommodityStockAnalyzer("Gold", commoditySymbol, commodityPrices, commodityType);


        equityStock.displayAnalysis();
        System.out.println();
        commodityStock.displayAnalysis();


        if (equityStock.calculateAveragePrice() > commodityStock.calculateAveragePrice()) {
            System.out.println("\nStock with Highest Average Price: Equity Stock - " + equityName +
                    " with Average Price: " + equityStock.calculateAveragePrice());
        } else {
            System.out.println("\nStock with Highest Average Price: Commodity Stock - " + commodityType +
                    " with Average Price: " + commodityStock.calculateAveragePrice());
        }


        int[] equityTrend = equityStock.findLongestIncreasingTrend();
        int[] commodityTrend = commodityStock.findLongestIncreasingTrend();
        if (equityTrend[2] > commodityTrend[2]) {
            System.out.println("Stock with Longest Increasing Trend: Equity Stock - " + equityName +
                    " with a trend length of " + equityTrend[2] + " days.");
        } else if (equityTrend[2] < commodityTrend[2]) {
            System.out.println("Stock with Longest Increasing Trend: Commodity Stock - " + commodityType +
                    " with a trend length of " + commodityTrend[2] + " days.");
        } else {
            System.out.println("Both stocks have the same trend length of " + equityTrend[2] + " days.");
        }
    }
}

