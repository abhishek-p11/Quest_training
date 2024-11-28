package com.quest.set;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(3);
       // set.add(null); //set not allow null value
//        for (int i : set) {
//            System.out.println("from set:"+i);
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(4);
//        list.add(2);
//        list.add(3);
//
//        for (int i : list) {
//            System.out.println("from list:"+i);
//        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(1));
        System.out.println(set.remove(4));
        System.out.println(set);
    }
}
