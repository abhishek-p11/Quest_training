package com.quest.LibraryManagement;

interface LibraryOperation {
    void borrowBook(String isbn);
    void returnBook(String isbn);
}
