package com.quest.stockanalysis;

public class CommodityStockAnalyzer extends StockAnalyzer {
    String commodityType;

    public CommodityStockAnalyzer(String stockName, String stockSymbol, int[] prices, String commodityType) {
        super(stockName, stockSymbol, prices);
        this.commodityType = commodityType;
    }

    @Override
    public int findMaxPrice() {
        int max = prices[0];
        for (int price : prices) {
            if (price > max) {
                max = price;
            }
        }
        return max;
    }

    @Override
    public int findMinPrice() {
        int min = prices[0];
        for (int price : prices) {
            if (price < min) {
                min = price;
            }
        }
        return min;
    }

    @Override
    public double calculateAveragePrice() {
        double sum = 0;
        for (int price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    @Override
    public int[] findLongestIncreasingTrend() {
        int maxLength = 0, start = 0, end = 0;
        int currentStart = 0, currentLength = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = currentStart;
                    end = i - 1;
                }

            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            start = currentStart;
            end = prices.length - 1;
        }

        return new int[]{start, end, maxLength};
    }

    @Override
    public void displayAnalysis() {
        System.out.println("Analysis for Commodity Stock:");
        System.out.println("Stock Name: " + stockName);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Commodity Type: " + commodityType);
        System.out.println("Highest Price: " + findMaxPrice());
        System.out.println("Lowest Price: " + findMinPrice());
        System.out.println("Average Price: " + calculateAveragePrice());

        int[] trend = findLongestIncreasingTrend();
        System.out.println("Longest Increasing Trend: Start Day " + (trend[0] + 1) + ", End Day " + (trend[1] + 1) +
                ", Length: " + trend[2] + " days");
    }
}
