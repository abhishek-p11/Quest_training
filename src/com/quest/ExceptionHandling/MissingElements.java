package com.quest.ExceptionHandling;

public class MissingElements {
    public static void main(String[] args) {
     int[] array = {13,3,4,6,13,8,9};
     int temp=0;
     for(int i=0;i<array.length-1;i++){
         if(array[i]>temp){
             temp=array[i];
         }
     }

     for(int i=1 ; i<=temp ; i++){
         int count=0;
         for(int j=0 ; j<= array.length-1 ; j++){
             if(i==array[j]){
                count=1;
             }
         }
        if(count==0){
            System.out.println(i);
        }
     }
    }
}
