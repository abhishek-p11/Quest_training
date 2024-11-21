package com.quest.practice_vars;
import java.util.Arrays;
public class SecondLargest {
    public static void main(String[] args) {
        int[] a={2,4,7,5,8,8};
        Arrays.sort(a);
        for(int i=a.length-1;i>0;i--) {
            if (a[i-1] < a[i]) {
                System.out.println("second largest number is:" + a[i-1]);
                break;
            }
        }
    }
}
