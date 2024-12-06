package com.quest.Dec4;

import java.util.Arrays;

public class SecondLargest3 {
    public static void main(String[] args) {
        int[] arr = {6,3,7,4,9,3};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);

    }
}
