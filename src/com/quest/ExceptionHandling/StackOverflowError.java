package com.quest.ExceptionHandling;

public class StackOverflowError {
    public static void main(String[] args) {
        causeStackOverflow();

    }
   static void causeStackOverflow(){
        causeStackOverflow();
    }
}
