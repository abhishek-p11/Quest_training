package com.quest.LibraryManagementSystem;

class Book extends LibraryEntity {
    private String ISBN;

    public Book(String ISBN, String title, String author, int publicationYear) {
        super(title, author, publicationYear);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String getDetails() {
        return "ISBN: " + ISBN + ", Title: " + title + ", Author: " + author +
                ", Year: " + publicationYear + ", Available: " + isAvailable;
    }
}