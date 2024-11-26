package com.quest.ExceptionHandling2;

public class Book {
        private String title;
        private String author;
        private double price;
        private int stock;

        // Final constant for discount percentage
        public static final double DISCOUNT_PERCENTAGE = 10.0;

        // Constructor using `this`
        public Book(String title, String author, double price, int stock) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.stock = stock;
        }

        // Getters
        public String getTitle() {
            return title;
        }

        public double getPrice() {
            return price;
        }

        public int getStock() {
            return stock;
        }

        // Method to purchase books
        public void purchase(int quantity) throws OutOfStockException {
            if (quantity > stock) {
                throw new OutOfStockException("Insufficient stock for " + title);
            }
            stock -= quantity;
            System.out.println(quantity + " copies of \"" + title + "\" purchased successfully.");
        }

        @Override
        public String toString() {
            return "Book [Title: " + title + ", Author: " + author + ", Price: $" + price + ", Stock: " + stock + "]";
        }
    }


