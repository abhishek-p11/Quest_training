package com.quest.stockanalysis;
import java.util.Arrays;
public class Array2 {
    public static void main(String[] args) {
        int[] input = {10, 20, 10, 10, 30, 20, 50,40, 40, 30, 30, 10};
        Arrays.sort(input);
        int count = 1;
        for (int i = 1; i <= input.length; i++) {
            if (i < input.length && input[i] == input[i - 1]) {
                count++;
            } else {
                int s = count / 2;
                if (s > 0) {
                    System.out.println(input[i - 1] + "'s-" + count / 2);
                    count = 1;
                }
            }
        }
    }
}
