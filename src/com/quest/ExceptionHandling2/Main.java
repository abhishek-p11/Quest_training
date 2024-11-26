package com.quest.ExceptionHandling2;
import java.util.Arrays;
public class Main {
        public static void main(String[] args) {

            Book[] books = new Book[5];
            books[0] = new Book("The Alchemist", "Paulo Coelho", 15.99, 10);
            books[1] = new Book("1984", "George Orwell", 9.99, 5);
            books[2] = new Book("To Kill a Mockingbird", "Harper Lee", 12.49, 2);
            books[3] = new SpecialEditionBook("Dune", "Frank Herbert", 25.99, 8, "Illustrated Edition");
            books[4] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 7.99, 20);

            // Display all books
            System.out.println("Bookstore Inventory:");
            for (Book book : books) {
                System.out.println(book);
            }
            // Attempt to purchase books
            try {
                books[2].purchase(3);
            } catch (OutOfStockException e) {
                System.out.println("Error: " + e.getMessage());
            }

            // Display books priced above a given value using lambda expression
            double priceThreshold = 10.0;

            System.out.println("\nBooks priced above $" + priceThreshold + ":");
            Arrays.stream(books)
                        .filter(book -> book.getPrice() > priceThreshold)
                        .forEach(book -> System.out.println(book.getTitle()));

            System.out.println("\nDiscount on all books: " + Book.DISCOUNT_PERCENTAGE + "%");

        }
    }
