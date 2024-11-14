package com.quest.practice_vars;

public class ArraySorted {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2};

        sortArray(array);

        System.out.print("Sorted Array: ");
        printArray(array);
    }

    public static int[] sortArray(int[] arr) {

        return arr;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}