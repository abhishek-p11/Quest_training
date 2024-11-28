package com.quest.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhash {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.remove("D"));
        System.out.println(set.isEmpty());
        System.out.println(set.contains("A"));
        System.out.println(set.getFirst());
        System.out.println(set.getLast());
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
