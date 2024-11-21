package com.quest.LibraryManagementSystem;

abstract class LibraryEntity {

    public String title;
    public String author;
    public int publicationYear;
    public boolean isAvailable;

    public LibraryEntity(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public abstract String getDetails();
}


