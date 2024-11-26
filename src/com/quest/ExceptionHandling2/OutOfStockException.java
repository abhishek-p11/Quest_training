package com.quest.ExceptionHandling2;

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}
