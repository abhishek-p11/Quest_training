package com.quest.ExceptionHandling2;

class SpecialEditionBook extends Book {
    private String specialFeature;

    // Constructor using super
    public SpecialEditionBook(String title, String author, double price, int stock, String specialFeature) {
        super(title, author, price, stock);
        this.specialFeature = specialFeature;
    }

    @Override
    public String toString() {
        return super.toString() + ", Special Feature: " + specialFeature;
    }
}

