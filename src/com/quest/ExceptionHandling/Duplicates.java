package com.quest.ExceptionHandling;

public class Duplicates {
    public static void main(String[] args) {
        int[] array=new int[5];
        array[0]=1;
        array[1]=1;
        array[2]=1;
        array[3]=3;
        array[4]=5;
        for(int i=0;i<array.length;i++){
            int temp=array[i];
            int count=0;
            for(int j=0;j<array.length;j++){
                if(temp==array[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(array[i]);
            }
        }
    }
}
