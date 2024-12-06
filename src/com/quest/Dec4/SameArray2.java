package com.quest.Dec4;

import java.util.Arrays;

public class SameArray2 {
    public static void main(String[] args) {
            int[] a1 = {1, 2, 3, 4, 5};
            int[] a2 = {1, 2, 3, 4, 5};

            boolean same = sameArray(a1, a2);
            if (same) {
                System.out.println("Arrays are equal");
            } else {
                System.out.println("Arrays are not equal");
            }
        }

        static boolean sameArray ( int[] a1, int[] a2){
            if (a1.length != a2.length) {
                return false;
            }
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1, a2);
        }
    }
