package com.quest.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();
        LinkedHashMap<Integer, String> ll = new LinkedHashMap<>();
        map.put(1, "A");
        map.put(3, "B");
        map.put(2, "C");
        map.put(4, "D");

        tm.put(1, "A");
        tm.put(3, "B");
        tm.put(2, "C");
        tm.put(4, "D");

        map.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("");
        tm.forEach((k, v) -> System.out.println(k + ": " + v));

System.out.println("");
        HashMap<Integer, String> map2 = new HashMap<>();
        TreeMap<Integer, String> tm2 = new TreeMap<>();
        map2.put(1, "A");
        map2.put(3, "B");
        map2.put(2, "C");
        map2.put(null, "d");
        map2.put(5, null);

        tm2.put(1, "A");
        tm2.put(3, "B");
        tm2.put(2, "C");
        tm2.put(4, null);
        tm2.put(5, null);

        map2.forEach((k, v) -> System.out.println(k + ": " + v));
        System.out.println("");
        tm2.forEach((k, v) -> System.out.println(k + ": " + v));
System.out.println("");


        ll.put(1, "A");
        ll.put(3, "B");
        ll.put(null, null);
        ll.put(null, null);
        ll.put(5, null);
        ll.forEach((k, v) -> System.out.println(k + ": " + v));

    }
}
