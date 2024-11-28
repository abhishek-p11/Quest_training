package com.quest.Map;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Apple");
        hm.put(3, "Orange");
        hm.put(2, "Banana");
        hm.put(4, "Pear");
        hm.put(5, "Grape");
        for (Integer key : hm.keySet()) {
            System.out.println(hm.get(key));
        }
        for(Integer key : hm.keySet()) {
            System.out.println(key);
        }
        for(String str : hm.values()) {
            System.out.println(str);
        }
        System.out.println(hm.put(4,"watermelon"));
        for(Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println(hm.get(1));
        System.out.println(hm.remove(2));
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());

    }
}
