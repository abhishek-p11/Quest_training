package com.quest.ExceptionHandling;

public class OutOfMemoryError {
    public static void main(String[] args) {
        int[] arr = new int[Integer.MAX_VALUE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
}
