package com.quest.Map;

import java.util.LinkedHashMap;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
        lhm.put(1, "one");
        lhm.put(2, "two");
        lhm.put(3, "three");
        lhm.put(4, "four");
        lhm.put(5, "five");
        System.out.println(lhm);
        System.out.println(lhm.get(1));
        for (Integer key : lhm.keySet()) {
            System.out.println(key);
        }
        for(String str : lhm.values()) {
            System.out.println(str);
        }
        System.out.println(lhm.put(4,"six"));
        for(String str : lhm.values()) {
            System.out.println(str);
        }
        System.out.println(lhm.remove(4));
        System.out.println(lhm.size());

        lhm.forEach((key,value)->{
            System.out.println(key+" "+value);
        });


    }
}
