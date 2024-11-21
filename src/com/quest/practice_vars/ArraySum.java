package com.quest.practice_vars;
import java.util.Arrays;
public class ArraySum {
    public static void main(String[] args) {
        int sum=0;
        int[] a={2,4,5,7,8};
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        for(int i=0;i<a.length;i++) {
            a[i] = sum - a[i];

        }
        System.out.println(Arrays.toString(a));
    }

}
