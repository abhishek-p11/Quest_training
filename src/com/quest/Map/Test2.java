package com.quest.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        HashMap<Double, Boolean> map = new HashMap<>();
        TreeMap<Character, String> tm = new TreeMap<>();
        LinkedHashMap<Byte, Float> ll = new LinkedHashMap<>();

        map.put(1.1,true);
        map.put(1.2,false);
        map.put(1.3,false);
        map.put(1.4,true);
        map.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("");
        tm.put('a',"apple");
        tm.put('b',"banana");
        tm.put('o',"orange");
        tm.put('p',"pear");
        tm.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("");
        ll.put((byte)1,3.56F);
        ll.put((byte)2,4.56F);
        ll.put((byte)3,5.56F);
        ll.put((byte)4,6.56F);
        ll.put((byte)5,7.56F);
        ll.forEach((k, v) -> System.out.println(k + ": " + v));


    }
}
