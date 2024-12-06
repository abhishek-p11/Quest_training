package com.quest.Dec4;

public class LongestString4 {
    public static void main(String[] args) {
        String[] str={"abhi","hello","world","welcome"};
        int length=0;
        int index=0;
        for (int i=0;i<str.length;i++){
            if(str[i].length()>length){
                length=str[i].length();
                index=i;
            }
        }
        System.out.println("largest string is:"+str[index]);
    }
}
