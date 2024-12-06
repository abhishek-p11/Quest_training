package com.quest.Dec4;

public class SwapArray {
    public static void main(String[] args) {
        int[] a = {1,6,4,8,3,9};
        for(int i = 0; i<a.length/2; i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
      for(int i = 0; i<a.length; i++){
          System.out.print(a[i]+" ");
      }
    }
}
