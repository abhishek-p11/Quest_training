package com.quest.Map;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "one");
        map.put(3, "three");
        map.put(2, "two");
        map.put(4, "four");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.remove(3));
    }
}
